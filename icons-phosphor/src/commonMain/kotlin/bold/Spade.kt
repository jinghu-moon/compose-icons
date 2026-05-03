package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorBoldIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(133.37f, 13.27f),
                    PathNode.CurveTo(129.98979f, 11.578543f, 126.01021f, 11.578543f, 122.63f, 13.27f),
                    PathNode.CurveTo(118.44f, 15.36f, 20.0f, 65.4f, 20.0f, 136.0f),
                    PathNode.CurveTo(19.99752f, 153.57596f, 27.701647f, 170.26918f, 41.077633f, 181.6708f),
                    PathNode.CurveTo(54.453617f, 193.07243f, 72.15623f, 198.03578f, 89.51f, 195.25f),
                    PathNode.LineTo(84.23f, 221.65f),
                    PathNode.CurveTo(83.52599f, 225.17532f, 84.43957f, 228.83057f, 86.71938f, 231.61012f),
                    PathNode.CurveTo(88.9992f, 234.38966f, 92.405075f, 236.0007f, 96.0f, 236.0f),
                    PathNode.LineTo(160.0f, 236.0f),
                    PathNode.CurveTo(163.59492f, 236.0007f, 167.0008f, 234.38966f, 169.28061f, 231.61012f),
                    PathNode.CurveTo(171.56042f, 228.83057f, 172.474f, 225.17532f, 171.77f, 221.65f),
                    PathNode.LineTo(166.49f, 195.25f),
                    PathNode.CurveTo(183.84378f, 198.03578f, 201.54639f, 193.07243f, 214.92236f, 181.6708f),
                    PathNode.CurveTo(228.29836f, 170.26918f, 236.00246f, 153.57596f, 236.0f, 136.0f),
                    PathNode.CurveTo(236.0f, 65.4f, 137.56f, 15.36f, 133.37f, 13.27f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 172.0f),
                    PathNode.CurveTo(169.24878f, 172.00899f, 162.63199f, 170.11302f, 156.91f, 166.53f),
                    PathNode.CurveTo(152.84969f, 163.98521f, 147.66464f, 164.09998f, 143.72089f, 166.8219f),
                    PathNode.CurveTo(139.77713f, 169.54382f, 137.83078f, 174.35106f, 138.77f, 179.05f),
                    PathNode.LineTo(145.36f, 212.0f),
                    PathNode.LineTo(110.64f, 212.0f),
                    PathNode.LineTo(117.23f, 179.05f),
                    PathNode.CurveTo(118.16921f, 174.35106f, 116.22287f, 169.54382f, 112.27911f, 166.8219f),
                    PathNode.CurveTo(108.33536f, 164.09998f, 103.150314f, 163.98521f, 99.09f, 166.53f),
                    PathNode.CurveTo(87.99155f, 173.47162f, 73.999695f, 173.84163f, 62.54986f, 167.49632f),
                    PathNode.CurveTo(51.10003f, 161.151f, 43.996967f, 149.09052f, 44.0f, 136.0f),
                    PathNode.CurveTo(44.0f, 107.71f, 67.57f, 82.05f, 87.34f, 65.51f),
                    PathNode.CurveTo(100.03025f, 55.016697f, 113.63838f, 45.68579f, 128.0f, 37.63f),
                    PathNode.CurveTo(142.3631f, 45.6834f, 155.97145f, 55.014454f, 168.66f, 65.51f),
                    PathNode.CurveTo(188.43f, 82.05f, 212.0f, 107.71f, 212.0f, 136.0f),
                    PathNode.CurveTo(212.0f, 155.88223f, 195.88223f, 172.0f, 176.0f, 172.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _spade!!
    }

private var _spade: ImageVector? = null
