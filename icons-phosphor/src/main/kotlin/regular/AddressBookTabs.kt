package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) return _addressBookTabs!!
        _addressBookTabs = phosphorRegularIcon(
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
                    PathNode.MoveTo(192.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.75f, 166.0f),
                    PathNode.CurveTo(149.16121f, 156.33405f, 143.0229f, 147.99965f, 134.56f, 142.66f),
                    PathNode.CurveTo(143.75142f, 133.52312f, 146.52414f, 119.74444f, 141.58232f, 107.76349f),
                    PathNode.CurveTo(136.64052f, 95.78253f, 124.96012f, 87.96536f, 112.0f, 87.96536f),
                    PathNode.CurveTo(99.03988f, 87.96536f, 87.35948f, 95.78253f, 82.41767f, 107.76349f),
                    PathNode.CurveTo(77.47587f, 119.74444f, 80.24859f, 133.52312f, 89.44f, 142.66f),
                    PathNode.CurveTo(80.98255f, 148.00551f, 74.846f, 156.33751f, 72.25f, 166.0f),
                    PathNode.CurveTo(71.14543f, 170.28021f, 73.719795f, 174.64543f, 78.0f, 175.75f),
                    PathNode.CurveTo(82.280205f, 176.85457f, 86.64543f, 174.28021f, 87.75f, 170.0f),
                    PathNode.CurveTo(90.39f, 159.75f, 100.81f, 152.0f, 112.0f, 152.0f),
                    PathNode.CurveTo(123.19f, 152.0f, 133.62f, 159.73f, 136.25f, 170.0f),
                    PathNode.CurveTo(137.35457f, 174.28021f, 141.71979f, 176.85457f, 146.0f, 175.75f),
                    PathNode.CurveTo(150.28021f, 174.64543f, 152.85457f, 170.28021f, 151.75f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 111.163445f, 103.163445f, 104.0f, 112.0f, 104.0f),
                    PathNode.CurveTo(120.836555f, 104.0f, 128.0f, 111.163445f, 128.0f, 120.0f),
                    PathNode.CurveTo(128.0f, 128.83656f, 120.836555f, 136.0f, 112.0f, 136.0f),
                    PathNode.CurveTo(103.163445f, 136.0f, 96.0f, 128.83656f, 96.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _addressBookTabs!!
    }

private var _addressBookTabs: ImageVector? = null
