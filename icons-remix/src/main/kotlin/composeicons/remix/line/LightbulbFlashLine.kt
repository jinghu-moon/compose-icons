package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LightbulbFlashLine: ImageVector
    get() {
        if (_lightbulbFlashLine != null) return _lightbulbFlashLine!!
        _lightbulbFlashLine = remixIcon(
            name = "LightbulbFlashLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.973 18h4.054c.132-1.202 .745-2.193 1.741-3.277 .112-.122 .831-.866 .916-.972C17.532 12.693 18 11.385 18 10 18 6.686 15.314 4 12 4 8.686 4 6 6.686 6 10c0 1.384 .468 2.692 1.315 3.748 .085 .107 .806 .853 .917 .973 .996 1.085 1.609 2.077 1.742 3.278ZM14 20h-4v1h4v-1ZM5.754 14.999C4.656 13.63 4 11.892 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8 0 1.892-.657 3.632-1.756 5.001C17.624 15.775 16 17 16 18.5v2.5c0 1.105-.895 2-2 2h-4C8.895 23 8 22.105 8 21v-2.5C8 17 6.375 15.774 5.754 14.999ZM13 10.005h2.5L11 16.005v-4h-2.5L13 6v4.005Z"),
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
        return _lightbulbFlashLine!!
    }

private var _lightbulbFlashLine: ImageVector? = null
