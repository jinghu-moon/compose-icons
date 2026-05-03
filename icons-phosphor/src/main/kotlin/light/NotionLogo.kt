package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorLightIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 42.000 L 168.000 42.000 C 164.686 42.000 162.000 44.686 162.000 48.000 C 162.000 51.314 164.686 54.000 168.000 54.000 L 186.000 54.000 L 186.000 184.640 L 109.260 45.110 C 108.205 43.191 106.189 41.999 104.000 42.000 L 40.000 42.000 C 36.686 42.000 34.000 44.686 34.000 48.000 C 34.000 51.314 36.686 54.000 40.000 54.000 L 58.000 54.000 L 58.000 202.000 L 40.000 202.000 C 36.686 202.000 34.000 204.686 34.000 208.000 C 34.000 211.314 36.686 214.000 40.000 214.000 L 88.000 214.000 C 91.314 214.000 94.000 211.314 94.000 208.000 C 94.000 204.686 91.314 202.000 88.000 202.000 L 70.000 202.000 L 70.000 71.360 L 146.740 210.890 C 147.795 212.809 149.811 214.001 152.000 214.000 L 192.000 214.000 C 195.314 214.000 198.000 211.314 198.000 208.000 L 198.000 54.000 L 216.000 54.000 C 219.314 54.000 222.000 51.314 222.000 48.000 C 222.000 44.686 219.314 42.000 216.000 42.000 ZM 74.150 54.000 L 100.450 54.000 L 181.850 202.000 L 155.550 202.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
