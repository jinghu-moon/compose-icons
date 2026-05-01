package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorThinIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 40.0f),
                    PathNode.LineTo(220.0f, 76.0f),
                    PathNode.CurveTo(220.0f, 78.20914f, 218.20914f, 80.0f, 216.0f, 80.0f),
                    PathNode.CurveTo(213.79086f, 80.0f, 212.0f, 78.20914f, 212.0f, 76.0f),
                    PathNode.LineTo(212.0f, 44.0f),
                    PathNode.LineTo(180.0f, 44.0f),
                    PathNode.CurveTo(177.79086f, 44.0f, 176.0f, 42.20914f, 176.0f, 40.0f),
                    PathNode.CurveTo(176.0f, 37.79086f, 177.79086f, 36.0f, 180.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(218.20914f, 36.0f, 220.0f, 37.79086f, 220.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 176.0f),
                    PathNode.CurveTo(213.79086f, 176.0f, 212.0f, 177.79086f, 212.0f, 180.0f),
                    PathNode.LineTo(212.0f, 212.0f),
                    PathNode.LineTo(180.0f, 212.0f),
                    PathNode.CurveTo(177.79086f, 212.0f, 176.0f, 213.79086f, 176.0f, 216.0f),
                    PathNode.CurveTo(176.0f, 218.20914f, 177.79086f, 220.0f, 180.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 180.0f),
                    PathNode.CurveTo(220.0f, 177.79086f, 218.20914f, 176.0f, 216.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 212.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.CurveTo(44.0f, 177.79086f, 42.20914f, 176.0f, 40.0f, 176.0f),
                    PathNode.CurveTo(37.79086f, 176.0f, 36.0f, 177.79086f, 36.0f, 180.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 218.20914f, 37.79086f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(76.0f, 220.0f),
                    PathNode.CurveTo(78.20914f, 220.0f, 80.0f, 218.20914f, 80.0f, 216.0f),
                    PathNode.CurveTo(80.0f, 213.79086f, 78.20914f, 212.0f, 76.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 80.0f),
                    PathNode.CurveTo(42.20914f, 80.0f, 44.0f, 78.20914f, 44.0f, 76.0f),
                    PathNode.LineTo(44.0f, 44.0f),
                    PathNode.LineTo(76.0f, 44.0f),
                    PathNode.CurveTo(78.20914f, 44.0f, 80.0f, 42.20914f, 80.0f, 40.0f),
                    PathNode.CurveTo(80.0f, 37.79086f, 78.20914f, 36.0f, 76.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(37.79086f, 36.0f, 36.0f, 37.79086f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 76.0f),
                    PathNode.CurveTo(36.0f, 78.20914f, 37.79086f, 80.0f, 40.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 172.0f),
                    PathNode.CurveTo(174.74097f, 172.0f, 173.55542f, 171.40723f, 172.8f, 170.4f),
                    PathNode.CurveTo(162.22415f, 156.29887f, 145.6264f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(110.37359f, 148.0f, 93.77585f, 156.29887f, 83.2f, 170.4f),
                    PathNode.CurveTo(81.87452f, 172.16731f, 79.36731f, 172.52548f, 77.6f, 171.2f),
                    PathNode.CurveTo(75.83269f, 169.87451f, 75.47452f, 167.36731f, 76.8f, 165.6f),
                    PathNode.CurveTo(84.91791f, 154.71088f, 96.30619f, 146.70404f, 109.3f, 142.75f),
                    PathNode.CurveTo(95.50598f, 134.36476f, 88.9802f, 117.82245f, 93.33418f, 102.27799f),
                    PathNode.CurveTo(97.68816f, 86.73354f, 111.8573f, 75.98785f, 128.0f, 75.98785f),
                    PathNode.CurveTo(144.14272f, 75.98785f, 158.31183f, 86.73354f, 162.66582f, 102.27799f),
                    PathNode.CurveTo(167.01979f, 117.82245f, 160.49402f, 134.36476f, 146.7f, 142.75f),
                    PathNode.CurveTo(159.69382f, 146.70404f, 171.08209f, 154.71088f, 179.2f, 165.6f),
                    PathNode.CurveTo(180.10905f, 166.81207f, 180.25528f, 168.43372f, 179.57771f, 169.78885f),
                    PathNode.CurveTo(178.90015f, 171.144f, 177.51509f, 172.0f, 176.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(143.46397f, 140.0f, 156.0f, 127.463974f, 156.0f, 112.0f),
                    PathNode.CurveTo(156.0f, 96.536026f, 143.46397f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(112.536026f, 84.0f, 100.0f, 96.536026f, 100.0f, 112.0f),
                    PathNode.CurveTo(100.0f, 127.463974f, 112.536026f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
