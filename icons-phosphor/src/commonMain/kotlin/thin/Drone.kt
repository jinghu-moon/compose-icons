package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Drone: ImageVector
    get() {
        if (_drone != null) return _drone!!
        _drone = phosphorThinIcon(
            name = "Drone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.83f, 74.83f),
                    PathNode.CurveTo(188.39296f, 73.26704f, 188.39296f, 70.73296f, 186.83f, 69.17f),
                    PathNode.CurveTo(185.26703f, 67.60703f, 182.73297f, 67.60703f, 181.17f, 69.17f),
                    PathNode.LineTo(150.34f, 100.0f),
                    PathNode.LineTo(105.66f, 100.0f),
                    PathNode.LineTo(74.83f, 69.17f),
                    PathNode.CurveTo(73.26704f, 67.60703f, 70.73296f, 67.60703f, 69.17f, 69.17f),
                    PathNode.CurveTo(67.60703f, 70.73296f, 67.60703f, 73.26704f, 69.17f, 74.83f),
                    PathNode.LineTo(100.0f, 105.66f),
                    PathNode.LineTo(100.0f, 150.34f),
                    PathNode.LineTo(69.17f, 181.17f),
                    PathNode.CurveTo(67.60703f, 182.73297f, 67.60703f, 185.26703f, 69.17f, 186.83f),
                    PathNode.CurveTo(70.73296f, 188.39296f, 73.26704f, 188.39296f, 74.83f, 186.83f),
                    PathNode.LineTo(105.66f, 156.0f),
                    PathNode.LineTo(150.34f, 156.0f),
                    PathNode.LineTo(181.17f, 186.83f),
                    PathNode.CurveTo(182.73297f, 188.39296f, 185.26703f, 188.39296f, 186.83f, 186.83f),
                    PathNode.CurveTo(188.39296f, 185.26703f, 188.39296f, 182.73297f, 186.83f, 181.17f),
                    PathNode.LineTo(156.0f, 150.34f),
                    PathNode.LineTo(156.0f, 105.66f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 108.0f),
                    PathNode.LineTo(148.0f, 108.0f),
                    PathNode.LineTo(148.0f, 148.0f),
                    PathNode.LineTo(108.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.28f, 62.67f),
                    PathNode.CurveTo(148.49246f, 45.10837f, 166.00525f, 34.159878f, 184.51382f, 36.26663f),
                    PathNode.CurveTo(203.02238f, 38.37338f, 217.62662f, 52.97761f, 219.73335f, 71.48618f),
                    PathNode.CurveTo(221.84012f, 89.99474f, 210.89163f, 107.50754f, 193.33f, 113.72f),
                    PathNode.CurveTo(192.9066f, 113.89086f, 192.45634f, 113.98565f, 192.0f, 114.0f),
                    PathNode.CurveTo(190.05383f, 113.99669f, 188.3925f, 112.59314f, 188.06415f, 110.67487f),
                    PathNode.CurveTo(187.7358f, 108.756615f, 188.83574f, 106.88041f, 190.67f, 106.23f),
                    PathNode.CurveTo(204.71289f, 101.25419f, 213.46407f, 87.24548f, 211.7766f, 72.442986f),
                    PathNode.CurveTo(210.08913f, 57.640488f, 198.40952f, 45.960873f, 183.60701f, 44.273403f),
                    PathNode.CurveTo(168.8045f, 42.585934f, 154.7958f, 51.33711f, 149.82f, 65.38f),
                    PathNode.CurveTo(149.38062f, 66.77362f, 148.21625f, 67.81675f, 146.78288f, 68.10087f),
                    PathNode.CurveTo(145.34953f, 68.38501f, 143.87529f, 67.86492f, 142.93752f, 66.744286f),
                    PathNode.CurveTo(141.99974f, 65.62366f, 141.74767f, 64.08083f, 142.28f, 62.72f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 180.0f),
                    PathNode.CurveTo(220.00891f, 199.48924f, 205.97055f, 216.14809f, 186.7618f, 219.44264f),
                    PathNode.CurveTo(167.55304f, 222.7372f, 148.76587f, 211.70836f, 142.28f, 193.33f),
                    PathNode.CurveTo(141.74767f, 191.96916f, 141.99974f, 190.42635f, 142.93752f, 189.30571f),
                    PathNode.CurveTo(143.87529f, 188.18507f, 145.34953f, 187.665f, 146.78288f, 187.94913f),
                    PathNode.CurveTo(148.21625f, 188.23325f, 149.38062f, 189.27638f, 149.82f, 190.67f),
                    PathNode.CurveTo(154.7958f, 204.71289f, 168.8045f, 213.46407f, 183.60701f, 211.7766f),
                    PathNode.CurveTo(198.40952f, 210.08913f, 210.08913f, 198.40952f, 211.7766f, 183.60701f),
                    PathNode.CurveTo(213.46407f, 168.8045f, 204.71289f, 154.7958f, 190.67f, 149.82f),
                    PathNode.CurveTo(188.66158f, 149.03433f, 187.63759f, 146.7979f, 188.35507f, 144.76413f),
                    PathNode.CurveTo(189.07256f, 142.73035f, 191.27318f, 141.63152f, 193.33f, 142.28f),
                    PathNode.CurveTo(209.30444f, 147.94527f, 219.98479f, 163.05072f, 220.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(113.72f, 193.33f),
                    PathNode.CurveTo(107.51353f, 210.90459f, 89.99156f, 221.86351f, 71.47315f, 219.75285f),
                    PathNode.CurveTo(52.954746f, 217.64221f, 38.348263f, 203.0214f, 36.255756f, 184.50093f),
                    PathNode.CurveTo(34.163246f, 165.98047f, 45.139347f, 148.46925f, 62.72f, 142.28f),
                    PathNode.CurveTo(64.77682f, 141.63152f, 66.97744f, 142.73035f, 67.69492f, 144.76413f),
                    PathNode.CurveTo(68.41241f, 146.7979f, 67.38843f, 149.03433f, 65.38f, 149.82f),
                    PathNode.CurveTo(51.33711f, 154.7958f, 42.585934f, 168.8045f, 44.273403f, 183.60701f),
                    PathNode.CurveTo(45.960873f, 198.40952f, 57.640488f, 210.08913f, 72.442986f, 211.7766f),
                    PathNode.CurveTo(87.24548f, 213.46407f, 101.25419f, 204.71289f, 106.23f, 190.67f),
                    PathNode.CurveTo(107.01567f, 188.66158f, 109.2521f, 187.63759f, 111.28587f, 188.35507f),
                    PathNode.CurveTo(113.31965f, 189.07256f, 114.41849f, 191.27318f, 113.77f, 193.33f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 76.0f),
                    PathNode.CurveTo(35.99108f, 56.510757f, 50.02944f, 39.851917f, 69.238205f, 36.55736f),
                    PathNode.CurveTo(88.44697f, 33.262806f, 107.23412f, 44.29164f, 113.72f, 62.67f),
                    PathNode.CurveTo(114.368484f, 64.72682f, 113.26965f, 66.92744f, 111.23588f, 67.64492f),
                    PathNode.CurveTo(109.202095f, 68.36241f, 106.96567f, 67.338425f, 106.18f, 65.33f),
                    PathNode.CurveTo(101.204185f, 51.28711f, 87.19548f, 42.535934f, 72.39298f, 44.223404f),
                    PathNode.CurveTo(57.59049f, 45.910873f, 45.910873f, 57.59049f, 44.223404f, 72.39298f),
                    PathNode.CurveTo(42.535934f, 87.19548f, 51.28711f, 101.204185f, 65.33f, 106.18f),
                    PathNode.CurveTo(67.2495f, 106.77095f, 68.43317f, 108.693634f, 68.09642f, 110.67361f),
                    PathNode.CurveTo(67.759674f, 112.65358f, 66.00693f, 114.07684f, 64.0f, 114.0f),
                    PathNode.CurveTo(63.546635f, 114.001625f, 63.096493f, 113.92378f, 62.67f, 113.77f),
                    PathNode.CurveTo(46.678265f, 108.098595f, 35.99405f, 92.96763f, 36.0f, 76.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _drone!!
    }

private var _drone: ImageVector? = null
