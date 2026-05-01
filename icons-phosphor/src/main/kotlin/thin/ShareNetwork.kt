package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorThinIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 164.0f),
                    PathNode.CurveTo(165.1662f, 164.00638f, 154.91132f, 168.8914f, 148.08f, 177.3f),
                    PathNode.LineTo(96.25f, 144.0f),
                    PathNode.CurveTo(101.26373f, 133.9225f, 101.26373f, 122.07751f, 96.25f, 112.0f),
                    PathNode.LineTo(148.08f, 78.7f),
                    PathNode.CurveTo(160.14339f, 93.4664f, 181.64055f, 96.237946f, 197.05475f, 85.01412f),
                    PathNode.CurveTo(212.46895f, 73.79029f, 216.43129f, 52.480453f, 206.08173f, 36.46613f),
                    PathNode.CurveTo(195.73218f, 20.451805f, 174.67557f, 15.310926f, 158.11064f, 24.7542f),
                    PathNode.CurveTo(141.54573f, 34.197475f, 135.24222f, 54.935726f, 143.75f, 72.0f),
                    PathNode.LineTo(91.92f, 105.3f),
                    PathNode.CurveTo(82.310936f, 93.472305f, 66.29569f, 88.97615f, 51.934784f, 94.07447f),
                    PathNode.CurveTo(37.573875f, 99.17279f, 27.978811f, 112.760956f, 27.978811f, 128.0f),
                    PathNode.CurveTo(27.978811f, 143.23904f, 37.573875f, 156.82721f, 51.934784f, 161.92552f),
                    PathNode.CurveTo(66.29569f, 167.02385f, 82.310936f, 162.5277f, 91.92f, 150.7f),
                    PathNode.LineTo(143.75f, 184.0f),
                    PathNode.CurveTo(136.60197f, 198.40732f, 139.87746f, 215.80812f, 151.77466f, 226.63043f),
                    PathNode.CurveTo(163.67184f, 237.45271f, 181.3042f, 239.07071f, 194.97229f, 230.59438f),
                    PathNode.CurveTo(208.64038f, 222.11804f, 215.02802f, 205.60393f, 210.6214f, 190.13632f),
                    PathNode.CurveTo(206.21478f, 174.66872f, 192.08307f, 164.00043f, 176.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 28.0f),
                    PathNode.CurveTo(191.46397f, 28.0f, 204.0f, 40.53603f, 204.0f, 56.0f),
                    PathNode.CurveTo(204.0f, 71.463974f, 191.46397f, 84.0f, 176.0f, 84.0f),
                    PathNode.CurveTo(160.53603f, 84.0f, 148.0f, 71.463974f, 148.0f, 56.0f),
                    PathNode.CurveTo(148.0f, 40.53603f, 160.53603f, 28.0f, 176.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 156.0f),
                    PathNode.CurveTo(48.53603f, 156.0f, 36.0f, 143.46397f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 112.536026f, 48.53603f, 100.0f, 64.0f, 100.0f),
                    PathNode.CurveTo(79.463974f, 100.0f, 92.0f, 112.536026f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 143.46397f, 79.463974f, 156.0f, 64.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 228.0f),
                    PathNode.CurveTo(160.53603f, 228.0f, 148.0f, 215.46397f, 148.0f, 200.0f),
                    PathNode.CurveTo(148.0f, 184.53603f, 160.53603f, 172.0f, 176.0f, 172.0f),
                    PathNode.CurveTo(191.46397f, 172.0f, 204.0f, 184.53603f, 204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 215.46397f, 191.46397f, 228.0f, 176.0f, 228.0f),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
