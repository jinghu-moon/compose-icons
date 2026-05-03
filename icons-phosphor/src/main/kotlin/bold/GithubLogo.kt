package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = phosphorBoldIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.620 75.170 C 217.266 58.611 215.019 40.877 206.390 26.000 C 204.247 22.288 200.286 20.001 196.000 20.000 C 176.543 19.945 158.127 28.785 146.000 44.000 L 126.000 44.000 C 113.873 28.785 95.457 19.945 76.000 20.000 C 71.714 20.001 67.753 22.288 65.610 26.000 C 56.981 40.877 54.734 58.611 59.380 75.170 C 54.597 84.031 52.063 93.931 52.000 104.000 L 52.000 112.000 C 52.039 139.637 70.921 163.686 97.760 170.280 C 93.978 176.893 91.992 184.381 92.000 192.000 L 92.000 196.000 L 76.000 196.000 C 64.954 196.000 56.000 187.046 56.000 176.000 C 55.972 151.711 36.289 132.028 12.000 132.000 C 5.373 132.000 -0.000 137.373 -0.000 144.000 C -0.000 150.627 5.373 156.000 12.000 156.000 C 23.046 156.000 32.000 164.954 32.000 176.000 C 32.028 200.289 51.711 219.972 76.000 220.000 L 92.000 220.000 L 92.000 232.000 C 92.000 238.627 97.373 244.000 104.000 244.000 C 110.627 244.000 116.000 238.627 116.000 232.000 L 116.000 192.000 C 116.000 180.954 124.954 172.000 136.000 172.000 C 147.046 172.000 156.000 180.954 156.000 192.000 L 156.000 232.000 C 156.000 238.627 161.373 244.000 168.000 244.000 C 174.627 244.000 180.000 238.627 180.000 232.000 L 180.000 192.000 C 180.008 184.381 178.022 176.893 174.240 170.280 C 201.079 163.686 219.961 139.637 220.000 112.000 L 220.000 104.000 C 219.937 93.931 217.403 84.031 212.620 75.170 ZM 196.000 112.000 C 196.000 131.882 179.882 148.000 160.000 148.000 L 112.000 148.000 C 92.118 148.000 76.000 131.882 76.000 112.000 L 76.000 104.000 C 76.103 96.849 78.228 89.873 82.130 83.880 C 84.661 80.603 85.263 76.229 83.710 72.390 C 80.268 63.495 80.126 53.661 83.310 44.670 C 94.204 46.677 103.772 53.126 109.720 62.470 C 111.925 65.914 115.731 67.998 119.820 68.000 L 152.170 68.000 C 156.262 68.001 160.073 65.917 162.280 62.470 C 168.226 53.123 177.795 46.674 188.690 44.670 C 191.874 53.661 191.732 63.495 188.290 72.390 C 186.802 76.254 187.410 80.612 189.900 83.920 C 193.785 89.905 195.900 96.866 196.000 104.000 Z"),
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
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
