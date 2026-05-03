package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorThinIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 40.000 84.000 L 76.290 84.000 C 78.287 97.767 90.089 107.981 104.000 107.981 C 117.911 107.981 129.713 97.767 131.710 84.000 L 216.000 84.000 C 218.209 84.000 220.000 82.209 220.000 80.000 C 220.000 77.791 218.209 76.000 216.000 76.000 L 131.710 76.000 C 129.713 62.233 117.911 52.019 104.000 52.019 C 90.089 52.019 78.287 62.233 76.290 76.000 L 40.000 76.000 C 37.791 76.000 36.000 77.791 36.000 80.000 C 36.000 82.209 37.791 84.000 40.000 84.000 ZM 104.000 60.000 C 115.046 60.000 124.000 68.954 124.000 80.000 C 124.000 91.046 115.046 100.000 104.000 100.000 C 92.954 100.000 84.000 91.046 84.000 80.000 C 84.000 68.954 92.954 60.000 104.000 60.000 ZM 216.000 172.000 L 195.710 172.000 C 193.713 158.233 181.911 148.019 168.000 148.019 C 154.089 148.019 142.287 158.233 140.290 172.000 L 40.000 172.000 C 37.791 172.000 36.000 173.791 36.000 176.000 C 36.000 178.209 37.791 180.000 40.000 180.000 L 140.290 180.000 C 142.287 193.767 154.089 203.981 168.000 203.981 C 181.911 203.981 193.713 193.767 195.710 180.000 L 216.000 180.000 C 218.209 180.000 220.000 178.209 220.000 176.000 C 220.000 173.791 218.209 172.000 216.000 172.000 ZM 168.000 196.000 C 156.954 196.000 148.000 187.046 148.000 176.000 C 148.000 164.954 156.954 156.000 168.000 156.000 C 179.046 156.000 188.000 164.954 188.000 176.000 C 188.000 187.046 179.046 196.000 168.000 196.000 Z"),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
