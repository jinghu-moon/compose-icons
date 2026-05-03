package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircleDashed: ImageVector
    get() {
        if (_userCircleDashed != null) return _userCircleDashed!!
        _userCircleDashed = phosphorLightIcon(
            name = "UserCircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(98.19f, 36.54f),
                    PathNode.CurveTo(97.79204f, 34.999084f, 98.02257f, 33.36319f, 98.83087f, 31.992262f),
                    PathNode.CurveTo(99.63917f, 30.621336f, 100.959015f, 29.627705f, 102.5f, 29.23f),
                    PathNode.CurveTo(119.22574f, 24.911434f, 136.77426f, 24.911434f, 153.5f, 29.23f),
                    PathNode.CurveTo(155.64746f, 29.698639f, 157.36678f, 31.303982f, 157.9814f, 33.414303f),
                    PathNode.CurveTo(158.596f, 35.524624f, 158.0075f, 37.802097f, 156.4475f, 39.3505f),
                    PathNode.CurveTo(154.88748f, 40.8989f, 152.60567f, 41.47036f, 150.5f, 40.84f),
                    PathNode.CurveTo(135.742f, 37.0295f, 120.258f, 37.0295f, 105.5f, 40.84f),
                    PathNode.CurveTo(102.29424f, 41.66937f, 99.02266f, 39.744904f, 98.19f, 36.54f),
                    PathNode.Close,
                    PathNode.MoveTo(33.89f, 108.08f),
                    PathNode.CurveTo(34.410675f, 108.22658f, 34.949085f, 108.300606f, 35.49f, 108.3f),
                    PathNode.CurveTo(38.18649f, 108.298775f, 40.550938f, 106.49885f, 41.27f, 103.9f),
                    PathNode.CurveTo(45.362907f, 89.238365f, 53.10772f, 75.85439f, 63.78f, 65.0f),
                    PathNode.CurveTo(66.102356f, 62.636223f, 66.06878f, 58.837357f, 63.705f, 56.515f),
                    PathNode.CurveTo(61.34122f, 54.192642f, 57.54236f, 54.226223f, 55.22f, 56.59f),
                    PathNode.CurveTo(43.12241f, 68.90045f, 34.342365f, 84.0763f, 29.7f, 100.7f),
                    PathNode.CurveTo(29.276743f, 102.23428f, 29.480433f, 103.87387f, 30.266245f, 105.25795f),
                    PathNode.CurveTo(31.052055f, 106.64203f, 32.355595f, 107.65718f, 33.89f, 108.08f),
                    PathNode.Close,
                    PathNode.MoveTo(150.5f, 215.15f),
                    PathNode.CurveTo(135.742f, 218.9605f, 120.258f, 218.9605f, 105.5f, 215.15f),
                    PathNode.CurveTo(103.39433f, 214.51964f, 101.112526f, 215.0911f, 99.55251f, 216.63948f),
                    PathNode.CurveTo(97.99249f, 218.1879f, 97.404f, 220.46538f, 98.01861f, 222.5757f),
                    PathNode.CurveTo(98.63322f, 224.68602f, 100.35254f, 226.29137f, 102.5f, 226.76f),
                    PathNode.CurveTo(119.22574f, 231.07857f, 136.77426f, 231.07857f, 153.5f, 226.76f),
                    PathNode.CurveTo(156.70877f, 225.93158f, 158.63843f, 222.65877f, 157.81f, 219.45f),
                    PathNode.CurveTo(156.98157f, 216.24123f, 153.70877f, 214.31157f, 150.5f, 215.14f),
                    PathNode.Close,
                    PathNode.MoveTo(214.72f, 103.91f),
                    PathNode.CurveTo(215.43906f, 106.50885f, 217.80351f, 108.30877f, 220.5f, 108.31f),
                    PathNode.CurveTo(221.04091f, 108.31061f, 221.57933f, 108.23657f, 222.1f, 108.09f),
                    PathNode.CurveTo(225.29124f, 107.2051f, 227.1621f, 103.902016f, 226.28f, 100.71f),
                    PathNode.CurveTo(221.66196f, 84.06228f, 212.89107f, 68.86032f, 200.79f, 56.53f),
                    PathNode.CurveTo(198.44472f, 54.30383f, 194.75714f, 54.33664f, 192.45183f, 56.604195f),
                    PathNode.CurveTo(190.14653f, 58.87175f, 190.05284f, 62.55828f, 192.24f, 64.94f),
                    PathNode.CurveTo(202.90771f, 75.82039f, 210.64209f, 89.228264f, 214.72f, 103.91f),
                    PathNode.Close,
                    PathNode.MoveTo(226.3f, 155.3f),
                    PathNode.CurveTo(221.11055f, 174.01596f, 210.67288f, 190.85571f, 196.22f, 203.83f),
                    PathNode.CurveTo(194.83292f, 205.08148f, 192.94203f, 205.61543f, 191.10522f, 205.27435f),
                    PathNode.CurveTo(189.26842f, 204.93326f, 187.6953f, 203.75604f, 186.85f, 202.09f),
                    PathNode.CurveTo(175.59917f, 179.92928f, 152.85315f, 165.96771f, 128.0f, 165.96771f),
                    PathNode.CurveTo(103.14684f, 165.96771f, 80.40084f, 179.92928f, 69.15f, 202.09f),
                    PathNode.CurveTo(68.30268f, 203.75555f, 66.72772f, 204.93123f, 64.89f, 205.27f),
                    PathNode.CurveTo(64.530685f, 205.33798f, 64.16569f, 205.37146f, 63.8f, 205.37f),
                    PathNode.CurveTo(62.322536f, 205.36667f, 60.898247f, 204.81831f, 59.8f, 203.83f),
                    PathNode.CurveTo(45.339336f, 190.85867f, 34.894497f, 174.01852f, 29.7f, 155.3f),
                    PathNode.CurveTo(29.075071f, 153.21843f, 29.624647f, 150.96167f, 31.136665f, 149.4005f),
                    PathNode.CurveTo(32.64868f, 147.83932f, 34.886723f, 147.21786f, 36.98721f, 147.77591f),
                    PathNode.CurveTo(39.087692f, 148.33395f, 40.722187f, 149.98425f, 41.26f, 152.09f),
                    PathNode.CurveTo(45.165634f, 166.15717f, 52.44247f, 179.05981f, 62.46f, 189.68f),
                    PathNode.CurveTo(71.88068f, 175.00432f, 85.97236f, 163.93178f, 102.46f, 158.25f),
                    PathNode.CurveTo(85.586006f, 147.01099f, 78.05988f, 126.04974f, 83.93095f, 106.644135f),
                    PathNode.CurveTo(89.80201f, 87.238525f, 107.68571f, 73.96488f, 127.96f, 73.96488f),
                    PathNode.CurveTo(148.2343f, 73.96488f, 166.118f, 87.238525f, 171.98906f, 106.644135f),
                    PathNode.CurveTo(177.8601f, 126.04974f, 170.33398f, 147.01099f, 153.46f, 158.25f),
                    PathNode.CurveTo(169.94765f, 163.93178f, 184.03932f, 175.00432f, 193.46f, 189.68f),
                    PathNode.CurveTo(203.47906f, 179.06483f, 210.75626f, 166.165f, 214.66f, 152.1f),
                    PathNode.CurveTo(215.18051f, 149.97688f, 216.81451f, 148.30486f, 218.92511f, 147.73566f),
                    PathNode.CurveTo(221.0357f, 147.16644f, 223.28883f, 147.79016f, 224.80629f, 149.36366f),
                    PathNode.CurveTo(226.32375f, 150.93716f, 226.86536f, 153.21144f, 226.22f, 155.3f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 154.0f),
                    PathNode.CurveTo(146.77768f, 154.0f, 162.0f, 138.77768f, 162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 101.22232f, 146.77768f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(109.22232f, 86.0f, 94.0f, 101.22232f, 94.0f, 120.0f),
                    PathNode.CurveTo(94.0f, 138.77768f, 109.22232f, 154.0f, 128.0f, 154.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userCircleDashed!!
    }

private var _userCircleDashed: ImageVector? = null
