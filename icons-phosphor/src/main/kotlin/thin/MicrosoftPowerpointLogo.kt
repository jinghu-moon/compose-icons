package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) return _microsoftPowerpointLogo!!
        _microsoftPowerpointLogo = phosphorThinIcon(
            name = "MicrosoftPowerpointLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 96.000 100.000 L 80.000 100.000 C 77.791 100.000 76.000 101.791 76.000 104.000 L 76.000 152.000 C 76.000 154.209 77.791 156.000 80.000 156.000 C 82.209 156.000 84.000 154.209 84.000 152.000 L 84.000 140.000 L 96.000 140.000 C 107.046 140.000 116.000 131.046 116.000 120.000 C 116.000 108.954 107.046 100.000 96.000 100.000 ZM 96.000 132.000 L 84.000 132.000 L 84.000 108.000 L 96.000 108.000 C 102.627 108.000 108.000 113.373 108.000 120.000 C 108.000 126.627 102.627 132.000 96.000 132.000 ZM 136.000 28.000 C 104.535 28.047 74.916 42.857 56.000 68.000 L 40.000 68.000 C 33.373 68.000 28.000 73.373 28.000 80.000 L 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 L 56.000 188.000 C 84.216 225.621 134.832 238.499 177.596 218.938 C 220.361 199.377 243.718 152.662 233.708 106.714 C 223.698 60.766 183.026 28.000 136.000 28.000 ZM 227.910 124.000 L 156.000 124.000 L 156.000 80.000 C 156.000 73.373 150.627 68.000 144.000 68.000 L 140.000 68.000 L 140.000 36.090 C 187.638 38.226 225.774 76.362 227.910 124.000 ZM 132.000 36.100 L 132.000 68.000 L 66.260 68.000 C 82.856 48.782 106.633 37.244 132.000 36.100 ZM 36.000 176.000 L 36.000 80.000 C 36.000 77.791 37.791 76.000 40.000 76.000 L 144.000 76.000 C 146.209 76.000 148.000 77.791 148.000 80.000 L 148.000 176.000 C 148.000 178.209 146.209 180.000 144.000 180.000 L 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 ZM 66.260 188.000 L 132.000 188.000 L 132.000 219.900 C 106.633 218.756 82.856 207.218 66.260 188.000 ZM 140.000 219.910 L 140.000 188.000 L 144.000 188.000 C 150.627 188.000 156.000 182.627 156.000 176.000 L 156.000 132.000 L 227.910 132.000 C 225.774 179.638 187.638 217.774 140.000 219.910 Z"),
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
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
