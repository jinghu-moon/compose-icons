package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LegoSmiley: ImageVector
    get() {
        if (_legoSmiley != null) return _legoSmiley!!
        _legoSmiley = phosphorBoldIcon(
            name = "LegoSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 84.000 112.000 C 84.000 103.163 91.163 96.000 100.000 96.000 C 108.837 96.000 116.000 103.163 116.000 112.000 C 116.000 120.837 108.837 128.000 100.000 128.000 C 91.163 128.000 84.000 120.837 84.000 112.000 ZM 156.000 96.000 C 147.163 96.000 140.000 103.163 140.000 112.000 C 140.000 120.837 147.163 128.000 156.000 128.000 C 164.837 128.000 172.000 120.837 172.000 112.000 C 172.000 103.163 164.837 96.000 156.000 96.000 ZM 149.600 141.850 C 136.368 150.052 119.632 150.052 106.400 141.850 C 102.772 139.506 98.165 139.293 94.337 141.291 C 90.508 143.289 88.048 147.190 87.896 151.506 C 87.743 155.822 89.922 159.887 93.600 162.150 C 114.653 175.282 141.347 175.282 162.400 162.150 C 166.078 159.887 168.257 155.822 168.104 151.506 C 167.952 147.190 165.492 143.289 161.663 141.291 C 157.835 139.293 153.228 139.506 149.600 141.850 ZM 220.000 84.000 L 220.000 172.000 C 219.979 187.249 210.370 200.837 196.000 205.940 L 196.000 224.000 C 196.000 235.046 187.046 244.000 176.000 244.000 L 80.000 244.000 C 68.954 244.000 60.000 235.046 60.000 224.000 L 60.000 205.940 C 45.630 200.837 36.021 187.249 36.000 172.000 L 36.000 84.000 C 36.000 64.118 52.118 48.000 72.000 48.000 L 84.000 48.000 L 84.000 32.000 C 84.000 20.954 92.954 12.000 104.000 12.000 L 152.000 12.000 C 163.046 12.000 172.000 20.954 172.000 32.000 L 172.000 48.000 L 184.000 48.000 C 203.882 48.000 220.000 64.118 220.000 84.000 ZM 108.000 48.000 L 148.000 48.000 L 148.000 36.000 L 108.000 36.000 ZM 172.000 220.000 L 172.000 208.000 L 84.000 208.000 L 84.000 220.000 ZM 196.000 84.000 C 196.000 77.373 190.627 72.000 184.000 72.000 L 72.000 72.000 C 65.373 72.000 60.000 77.373 60.000 84.000 L 60.000 172.000 C 60.000 178.627 65.373 184.000 72.000 184.000 L 184.000 184.000 C 190.627 184.000 196.000 178.627 196.000 172.000 Z"),
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
        return _legoSmiley!!
    }

private var _legoSmiley: ImageVector? = null
