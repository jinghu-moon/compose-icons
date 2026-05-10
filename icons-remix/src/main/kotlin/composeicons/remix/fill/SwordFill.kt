package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SwordFill: ImageVector
    get() {
        if (_swordFill != null) return _swordFill!!
        _swordFill = remixIcon(
            name = "SwordFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.048 13.406l3.535 3.536L9.17 18.356l1.415 1.415L9.171 21.185 6.696 18.71 3.867 21.539 2.453 20.125 5.282 17.296 2.807 14.821 4.221 13.407l1.414 1.413L7.048 13.406ZM2.999 3l3.546 .003L18.362 14.821l1.415-1.414 1.414 1.414-2.475 2.475 2.828 2.828-1.414 1.414L17.302 18.71l-2.475 2.475L13.413 19.771l1.414-1.415L3.002 6.531 2.999 3ZM17.456 3l3.543 .003 .002 3.523-4.053 4.052L13.412 7.043 17.456 3Z"),
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
        return _swordFill!!
    }

private var _swordFill: ImageVector? = null
