package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) return _addressBookTabs!!
        _addressBookTabs = phosphorFillIcon(
            name = "AddressBookTabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 175.75f),
                    PathNode.CurveTo(143.94455f, 176.27815f, 141.76347f, 175.96799f, 139.93677f, 174.88773f),
                    PathNode.CurveTo(138.11006f, 173.80745f, 136.78745f, 172.04564f, 136.26f, 169.99f),
                    PathNode.CurveTo(133.63f, 159.73f, 123.2f, 151.99f, 112.01f, 151.99f),
                    PathNode.CurveTo(100.82f, 151.99f, 90.4f, 159.73f, 87.76f, 169.99f),
                    PathNode.CurveTo(86.65543f, 174.2702f, 82.29021f, 176.84457f, 78.01f, 175.74f),
                    PathNode.CurveTo(73.72979f, 174.63544f, 71.15543f, 170.2702f, 72.26f, 165.99f),
                    PathNode.CurveTo(74.856f, 156.32751f, 80.99255f, 147.99551f, 89.45f, 142.65f),
                    PathNode.CurveTo(80.25859f, 133.51312f, 77.48586f, 119.73444f, 82.42767f, 107.75349f),
                    PathNode.CurveTo(87.36948f, 95.77253f, 99.04988f, 87.95537f, 112.01f, 87.95537f),
                    PathNode.CurveTo(124.97012f, 87.95537f, 136.65053f, 95.77253f, 141.59233f, 107.75349f),
                    PathNode.CurveTo(146.53413f, 119.73444f, 143.76141f, 133.51312f, 134.57f, 142.65f),
                    PathNode.CurveTo(143.03114f, 147.9939f, 149.16595f, 156.33195f, 151.75f, 166.0f),
                    PathNode.CurveTo(152.28151f, 168.05548f, 151.97418f, 170.23793f, 150.89569f, 172.06668f),
                    PathNode.CurveTo(149.81718f, 173.89545f, 148.056f, 175.22049f, 146.0f, 175.75f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 120.0f),
                    PathNode.CurveTo(128.0f, 128.83656f, 120.836555f, 136.0f, 112.0f, 136.0f),
                    PathNode.CurveTo(103.163445f, 136.0f, 96.0f, 128.83656f, 96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 111.163445f, 103.163445f, 104.0f, 112.0f, 104.0f),
                    PathNode.CurveTo(120.836555f, 104.0f, 128.0f, 111.163445f, 128.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _addressBookTabs!!
    }

private var _addressBookTabs: ImageVector? = null
