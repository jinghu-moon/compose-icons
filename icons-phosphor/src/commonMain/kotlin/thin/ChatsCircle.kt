package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) return _chatsCircle!!
        _chatsCircle = phosphorThinIcon(
            name = "ChatsCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.79f, 186.39f),
                    PathNode.CurveTo(239.19254f, 163.90472f, 238.70247f, 137.22844f, 226.48178f, 115.17713f),
                    PathNode.CurveTo(214.26111f, 93.12581f, 191.90062f, 78.56996f, 166.79f, 76.32f),
                    PathNode.CurveTo(156.51851f, 50.30464f, 132.78773f, 32.0335f, 105.01096f, 28.754185f),
                    PathNode.CurveTo(77.2342f, 25.474869f, 49.900993f, 37.717415f, 33.853603f, 60.625576f),
                    PathNode.CurveTo(17.806213f, 83.53374f, 15.638372f, 113.40487f, 28.21f, 138.39f),
                    PathNode.LineTo(20.5f, 164.6f),
                    PathNode.CurveTo(19.259834f, 168.81346f, 20.420685f, 173.36783f, 23.52643f, 176.47357f),
                    PathNode.CurveTo(26.632175f, 179.57932f, 31.186535f, 180.74017f, 35.4f, 179.5f),
                    PathNode.LineTo(61.61f, 171.79f),
                    PathNode.CurveTo(70.22395f, 176.15442f, 79.591354f, 178.83566f, 89.21f, 179.69f),
                    PathNode.CurveTo(97.014984f, 199.6556f, 112.88889f, 215.39645f, 132.91946f, 223.03314f),
                    PathNode.CurveTo(152.95003f, 230.66982f, 175.2742f, 229.49202f, 194.39f, 219.79f),
                    PathNode.LineTo(220.6f, 227.5f),
                    PathNode.CurveTo(224.81346f, 228.74017f, 229.36783f, 227.57932f, 232.47357f, 224.47357f),
                    PathNode.CurveTo(235.57932f, 221.36783f, 236.74017f, 216.81346f, 235.5f, 212.6f),
                    PathNode.Close,
                    PathNode.MoveTo(60.9f, 163.66f),
                    PathNode.LineTo(33.14f, 171.83f),
                    PathNode.CurveTo(31.72369f, 172.2661f, 30.182331f, 171.88344f, 29.13445f, 170.83556f),
                    PathNode.CurveTo(28.086567f, 169.78767f, 27.703896f, 168.2463f, 28.14f, 166.83f),
                    PathNode.LineTo(36.31f, 139.07f),
                    PathNode.CurveTo(36.594666f, 138.0672f, 36.483704f, 136.99341f, 36.0f, 136.07f),
                    PathNode.CurveTo(20.12206f, 106.34441f, 28.411575f, 69.47353f, 55.48463f, 49.404427f),
                    PathNode.CurveTo(82.557686f, 29.335318f, 120.24597f, 32.12312f, 144.0715f, 55.95719f),
                    PathNode.CurveTo(167.89705f, 79.79127f, 170.67134f, 117.48054f, 150.59254f, 144.5464f),
                    PathNode.CurveTo(130.51375f, 171.61227f, 93.6399f, 179.88858f, 63.92f, 164.0f),
                    PathNode.CurveTo(62.99531f, 163.49997f, 61.91272f, 163.37808f, 60.9f, 163.66f),
                    PathNode.Close,
                    PathNode.MoveTo(226.82f, 218.82f),
                    PathNode.CurveTo(225.7744f, 219.86778f, 224.23566f, 220.25246f, 222.82f, 219.82f),
                    PathNode.LineTo(195.06f, 211.65f),
                    PathNode.CurveTo(194.0572f, 211.36534f, 192.9834f, 211.47629f, 192.06f, 211.96f),
                    PathNode.CurveTo(175.4607f, 220.84459f, 155.92075f, 222.44943f, 138.09425f, 216.39229f),
                    PathNode.CurveTo(120.26775f, 210.33516f, 105.750404f, 197.1582f, 98.0f, 180.0f),
                    PathNode.CurveTo(121.20107f, 179.38713f, 142.8504f, 168.20642f, 156.78088f, 149.64284f),
                    PathNode.CurveTo(170.71136f, 131.07924f, 175.39589f, 107.1678f, 169.5f, 84.72f),
                    PathNode.CurveTo(191.48499f, 87.81741f, 210.57341f, 101.452515f, 220.63295f, 121.24492f),
                    PathNode.CurveTo(230.6925f, 141.03732f, 230.4562f, 164.49426f, 220.0f, 184.08f),
                    PathNode.CurveTo(219.5163f, 185.0034f, 219.40533f, 186.0772f, 219.69f, 187.08f),
                    PathNode.LineTo(227.86f, 214.84f),
                    PathNode.CurveTo(228.27434f, 216.25693f, 227.87456f, 217.7869f, 226.82f, 218.82f),
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
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
