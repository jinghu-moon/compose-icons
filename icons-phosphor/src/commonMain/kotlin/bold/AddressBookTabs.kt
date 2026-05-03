package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) return _addressBookTabs!!
        _addressBookTabs = phosphorBoldIcon(
            name = "AddressBookTabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 108.0f),
                    PathNode.LineTo(204.0f, 108.0f),
                    PathNode.LineTo(204.0f, 148.0f),
                    PathNode.LineTo(188.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 84.0f),
                    PathNode.LineTo(188.0f, 84.0f),
                    PathNode.LineTo(188.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 52.0f),
                    PathNode.LineTo(164.0f, 52.0f),
                    PathNode.LineTo(164.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 204.0f),
                    PathNode.LineTo(188.0f, 172.0f),
                    PathNode.LineTo(204.0f, 172.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.62f, 165.0f),
                    PathNode.CurveTo(149.21054f, 155.88504f, 143.88669f, 147.80795f, 136.46f, 142.0f),
                    PathNode.CurveTo(147.91684f, 127.20998f, 146.13571f, 106.109406f, 132.36176f, 93.44914f),
                    PathNode.CurveTo(118.58781f, 80.78888f, 97.41219f, 80.78888f, 83.63824f, 93.44914f),
                    PathNode.CurveTo(69.86429f, 106.109406f, 68.08316f, 127.20998f, 79.54f, 142.0f),
                    PathNode.CurveTo(72.12039f, 147.81447f, 66.79824f, 155.88898f, 64.38f, 165.0f),
                    PathNode.CurveTo(62.723145f, 171.41754f, 66.58245f, 177.96315f, 73.0f, 179.62f),
                    PathNode.CurveTo(79.41755f, 181.27686f, 85.96314f, 177.41754f, 87.62f, 171.0f),
                    PathNode.CurveTo(89.82f, 162.46f, 98.62f, 156.0f, 108.0f, 156.0f),
                    PathNode.CurveTo(117.38f, 156.0f, 126.19f, 162.44f, 128.38f, 171.0f),
                    PathNode.CurveTo(130.03685f, 177.41754f, 136.58246f, 181.27686f, 143.0f, 179.62f),
                    PathNode.CurveTo(149.41754f, 177.96315f, 153.27686f, 171.41754f, 151.62f, 165.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 113.37258f, 101.37258f, 108.0f, 108.0f, 108.0f),
                    PathNode.CurveTo(114.62742f, 108.0f, 120.0f, 113.37258f, 120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 126.62742f, 114.62742f, 132.0f, 108.0f, 132.0f),
                    PathNode.CurveTo(101.37258f, 132.0f, 96.0f, 126.62742f, 96.0f, 120.0f),
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
        return _addressBookTabs!!
    }

private var _addressBookTabs: ImageVector? = null
