package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PlayReverseMiniFill: ImageVector
    get() {
        if (_playReverseMiniFill != null) return _playReverseMiniFill!!
        _playReverseMiniFill = remixIcon(
            name = "PlayReverseMiniFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.248 5.439 5.74 11.568c-.239 .139-.319 .445-.18 .684 .043 .075 .105 .137 .18 .18l10.508 6.13c.239 .139 .545 .059 .684-.18 .045-.076 .068-.163 .068-.252v-12.259c0-.276-.224-.5-.5-.5-.089 0-.176 .023-.252 .068Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _playReverseMiniFill!!
    }

private var _playReverseMiniFill: ImageVector? = null
