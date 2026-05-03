package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tram: ImageVector
    get() {
        if (_tram != null) return _tram!!
        _tram = phosphorThinIcon(
            name = "Tram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 52.000 L 132.000 52.000 L 132.000 20.000 L 168.000 20.000 C 170.209 20.000 172.000 18.209 172.000 16.000 C 172.000 13.791 170.209 12.000 168.000 12.000 L 88.000 12.000 C 85.791 12.000 84.000 13.791 84.000 16.000 C 84.000 18.209 85.791 20.000 88.000 20.000 L 124.000 20.000 L 124.000 52.000 L 72.000 52.000 C 56.536 52.000 44.000 64.536 44.000 80.000 L 44.000 184.000 C 44.000 199.464 56.536 212.000 72.000 212.000 L 88.000 212.000 L 68.800 237.600 C 67.475 239.367 67.833 241.875 69.600 243.200 C 71.367 244.525 73.875 244.167 75.200 242.400 L 98.000 212.000 L 158.000 212.000 L 180.800 242.400 C 182.125 244.167 184.633 244.525 186.400 243.200 C 188.167 241.875 188.525 239.367 187.200 237.600 L 168.000 212.000 L 184.000 212.000 C 199.464 212.000 212.000 199.464 212.000 184.000 L 212.000 80.000 C 212.000 64.536 199.464 52.000 184.000 52.000 ZM 72.000 60.000 L 184.000 60.000 C 195.046 60.000 204.000 68.954 204.000 80.000 L 204.000 124.000 L 52.000 124.000 L 52.000 80.000 C 52.000 68.954 60.954 60.000 72.000 60.000 ZM 184.000 204.000 L 72.000 204.000 C 60.954 204.000 52.000 195.046 52.000 184.000 L 52.000 132.000 L 204.000 132.000 L 204.000 184.000 C 204.000 195.046 195.046 204.000 184.000 204.000 ZM 92.000 172.000 C 92.000 176.418 88.418 180.000 84.000 180.000 C 79.582 180.000 76.000 176.418 76.000 172.000 C 76.000 167.582 79.582 164.000 84.000 164.000 C 88.418 164.000 92.000 167.582 92.000 172.000 ZM 180.000 172.000 C 180.000 176.418 176.418 180.000 172.000 180.000 C 167.582 180.000 164.000 176.418 164.000 172.000 C 164.000 167.582 167.582 164.000 172.000 164.000 C 176.418 164.000 180.000 167.582 180.000 172.000 Z"),
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
        return _tram!!
    }

private var _tram: ImageVector? = null
