package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorThinIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(154.7f, 142.75f),
                    PathNode.CurveTo(168.49402f, 134.36476f, 175.01979f, 117.82245f, 170.66582f, 102.27799f),
                    PathNode.CurveTo(166.31183f, 86.73354f, 152.14272f, 75.98785f, 136.0f, 75.98785f),
                    PathNode.CurveTo(119.8573f, 75.98785f, 105.68816f, 86.73354f, 101.33418f, 102.27799f),
                    PathNode.CurveTo(96.9802f, 117.82245f, 103.50598f, 134.36476f, 117.3f, 142.75f),
                    PathNode.CurveTo(104.30495f, 146.70148f, 92.91593f, 154.70883f, 84.8f, 165.6f),
                    PathNode.CurveTo(83.47452f, 167.36731f, 83.83269f, 169.87451f, 85.6f, 171.2f),
                    PathNode.CurveTo(87.36731f, 172.52548f, 89.87452f, 172.16731f, 91.2f, 170.4f),
                    PathNode.CurveTo(101.77585f, 156.29887f, 118.37359f, 148.0f, 136.0f, 148.0f),
                    PathNode.CurveTo(153.6264f, 148.0f, 170.22415f, 156.29887f, 180.8f, 170.4f),
                    PathNode.CurveTo(182.12549f, 172.16731f, 184.63269f, 172.52548f, 186.4f, 171.2f),
                    PathNode.CurveTo(188.16731f, 169.87451f, 188.52548f, 167.36731f, 187.2f, 165.6f),
                    PathNode.CurveTo(179.08209f, 154.71088f, 167.69382f, 146.70404f, 154.7f, 142.75f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 112.0f),
                    PathNode.CurveTo(108.0f, 96.536026f, 120.536026f, 84.0f, 136.0f, 84.0f),
                    PathNode.CurveTo(151.46397f, 84.0f, 164.0f, 96.536026f, 164.0f, 112.0f),
                    PathNode.CurveTo(164.0f, 127.463974f, 151.46397f, 140.0f, 136.0f, 140.0f),
                    PathNode.CurveTo(120.536026f, 140.0f, 108.0f, 127.463974f, 108.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(57.37258f, 28.0f, 52.0f, 33.37258f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(29.790861f, 68.0f, 28.0f, 69.79086f, 28.0f, 72.0f),
                    PathNode.CurveTo(28.0f, 74.20914f, 29.790861f, 76.0f, 32.0f, 76.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(52.0f, 124.0f),
                    PathNode.LineTo(32.0f, 124.0f),
                    PathNode.CurveTo(29.790861f, 124.0f, 28.0f, 125.79086f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 130.20914f, 29.790861f, 132.0f, 32.0f, 132.0f),
                    PathNode.LineTo(52.0f, 132.0f),
                    PathNode.LineTo(52.0f, 180.0f),
                    PathNode.LineTo(32.0f, 180.0f),
                    PathNode.CurveTo(29.790861f, 180.0f, 28.0f, 181.79086f, 28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 186.20914f, 29.790861f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(52.0f, 188.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 222.62741f, 57.37258f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(214.62741f, 228.0f, 220.0f, 222.62741f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 33.37258f, 214.62741f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 216.0f),
                    PathNode.CurveTo(212.0f, 218.20914f, 210.20914f, 220.0f, 208.0f, 220.0f),
                    PathNode.LineTo(64.0f, 220.0f),
                    PathNode.CurveTo(61.79086f, 220.0f, 60.0f, 218.20914f, 60.0f, 216.0f),
                    PathNode.LineTo(60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 37.79086f, 61.79086f, 36.0f, 64.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(210.20914f, 36.0f, 212.0f, 37.79086f, 212.0f, 40.0f),
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
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
