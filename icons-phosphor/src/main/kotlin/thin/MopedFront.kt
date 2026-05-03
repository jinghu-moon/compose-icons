package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MopedFront: ImageVector
    get() {
        if (_mopedFront != null) return _mopedFront!!
        _mopedFront = phosphorThinIcon(
            name = "MopedFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 44.000 L 163.770 44.000 C 161.704 25.807 146.310 12.063 128.000 12.063 C 109.690 12.063 94.296 25.807 92.230 44.000 L 48.000 44.000 C 45.791 44.000 44.000 45.791 44.000 48.000 C 44.000 50.209 45.791 52.000 48.000 52.000 L 92.230 52.000 C 93.493 63.185 99.907 73.138 109.570 78.910 C 84.817 86.936 68.039 109.978 68.000 136.000 L 68.000 200.000 C 68.000 206.627 73.373 212.000 80.000 212.000 L 100.000 212.000 L 100.000 216.000 C 100.000 231.464 112.536 244.000 128.000 244.000 C 143.464 244.000 156.000 231.464 156.000 216.000 L 156.000 212.000 L 176.000 212.000 C 182.627 212.000 188.000 206.627 188.000 200.000 L 188.000 136.000 C 187.961 109.978 171.183 86.936 146.430 78.910 C 156.093 73.138 162.507 63.185 163.770 52.000 L 208.000 52.000 C 210.209 52.000 212.000 50.209 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 ZM 148.000 216.000 C 148.000 227.046 139.046 236.000 128.000 236.000 C 116.954 236.000 108.000 227.046 108.000 216.000 L 108.000 168.000 C 108.000 156.954 116.954 148.000 128.000 148.000 C 139.046 148.000 148.000 156.954 148.000 168.000 ZM 180.000 136.000 L 180.000 200.000 C 180.000 202.209 178.209 204.000 176.000 204.000 L 156.000 204.000 L 156.000 168.000 C 156.000 152.536 143.464 140.000 128.000 140.000 C 112.536 140.000 100.000 152.536 100.000 168.000 L 100.000 204.000 L 80.000 204.000 C 77.791 204.000 76.000 202.209 76.000 200.000 L 76.000 136.000 C 76.000 107.281 99.281 84.000 128.000 84.000 C 156.719 84.000 180.000 107.281 180.000 136.000 ZM 128.000 76.000 C 112.536 76.000 100.000 63.464 100.000 48.000 C 100.000 32.536 112.536 20.000 128.000 20.000 C 143.464 20.000 156.000 32.536 156.000 48.000 C 156.000 63.464 143.464 76.000 128.000 76.000 Z"),
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
        return _mopedFront!!
    }

private var _mopedFront: ImageVector? = null
