package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorLightIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M62.62 195.05l-9.45 16c-1.761 2.646-5.281 3.459-8.025 1.854C42.401 211.299 41.386 207.832 42.83 205l9.46-16c1.062-1.901 3.071-3.077 5.249-3.073 2.178 .004 4.182 1.188 5.237 3.093 1.055 1.905 .995 4.232-.156 6.08ZM232 154h-48.94L151.75 101c-1.687-2.853-5.367-3.797-8.22-2.11-2.853 1.687-3.797 5.367-2.11 8.22l61.41 103.93c1.684 2.855 5.365 3.804 8.22 2.12 2.855-1.684 3.804-5.365 2.12-8.22l-23-38.95h41.83c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM142.47 154h-55.59L157.17 35.05c1.444-2.832 .429-6.299-2.315-7.904-2.744-1.605-6.263-.792-8.025 1.854L128 60.82 109.17 29c-1.684-2.855-5.365-3.804-8.22-2.12-2.855 1.684-3.804 5.365-2.12 8.22L121 72.62 72.94 154h-48.94c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h118.47c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
