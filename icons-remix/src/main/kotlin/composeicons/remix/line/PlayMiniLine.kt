package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayMiniLine: ImageVector
    get() {
        if (_playMiniLine != null) return _playMiniLine!!
        _playMiniLine = remixIcon(
            name = "PlayMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 8.482v7.036l6.031-3.518L9 8.482ZM7.752 5.439l10.508 6.129c.239 .139 .319 .445 .18 .684-.044 .075-.105 .137-.18 .18L7.752 18.562c-.239 .139-.545 .059-.684-.18C7.023 18.305 7 18.218 7 18.13v-12.259c0-.276 .224-.5 .5-.5 .089 0 .175 .023 .252 .068Z"),
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
        return _playMiniLine!!
    }

private var _playMiniLine: ImageVector? = null
