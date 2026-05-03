package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorThinIcon(
            name = "TrayArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.LineTo(179.31f, 156.0f),
                    PathNode.CurveTo(176.12837f, 155.99242f, 173.07553f, 157.25604f, 170.83f, 159.51f),
                    PathNode.LineTo(151.51f, 178.83f),
                    PathNode.CurveTo(150.76166f, 179.57751f, 149.74773f, 179.9982f, 148.69f, 180.0f),
                    PathNode.LineTo(107.31f, 180.0f),
                    PathNode.CurveTo(106.25228f, 179.9982f, 105.238335f, 179.57751f, 104.49f, 178.83f),
                    PathNode.LineTo(85.17f, 159.52f),
                    PathNode.CurveTo(82.92802f, 157.25954f, 79.87373f, 155.99171f, 76.69f, 156.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 164.0f),
                    PathNode.LineTo(76.69f, 164.0f),
                    PathNode.CurveTo(77.74772f, 164.0018f, 78.761665f, 164.42249f, 79.51f, 165.17f),
                    PathNode.LineTo(98.83f, 184.48f),
                    PathNode.CurveTo(101.07198f, 186.74046f, 104.12627f, 188.00829f, 107.31f, 188.0f),
                    PathNode.LineTo(148.69f, 188.0f),
                    PathNode.CurveTo(151.87163f, 188.00758f, 154.92447f, 186.74396f, 157.17f, 184.49f),
                    PathNode.LineTo(176.49f, 165.17f),
                    PathNode.CurveTo(177.23834f, 164.42249f, 178.25227f, 164.0018f, 179.31f, 164.0f),
                    PathNode.LineTo(212.0f, 164.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(93.17f, 106.83f),
                    PathNode.CurveTo(92.418884f, 106.07973f, 91.99686f, 105.06164f, 91.99686f, 104.0f),
                    PathNode.CurveTo(91.99686f, 102.93836f, 92.418884f, 101.92027f, 93.17f, 101.17f),
                    PathNode.LineTo(125.17f, 69.17f),
                    PathNode.CurveTo(125.92027f, 68.418884f, 126.93836f, 67.99686f, 128.0f, 67.99686f),
                    PathNode.CurveTo(129.06163f, 67.99686f, 130.07973f, 68.418884f, 130.83f, 69.17f),
                    PathNode.LineTo(162.83f, 101.17f),
                    PathNode.CurveTo(164.39296f, 102.73296f, 164.39296f, 105.26704f, 162.83f, 106.83f),
                    PathNode.CurveTo(161.26703f, 108.39297f, 158.73297f, 108.39297f, 157.17f, 106.83f),
                    PathNode.LineTo(132.0f, 81.66f),
                    PathNode.LineTo(132.0f, 152.0f),
                    PathNode.CurveTo(132.0f, 154.20914f, 130.20914f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(125.79086f, 156.0f, 124.0f, 154.20914f, 124.0f, 152.0f),
                    PathNode.LineTo(124.0f, 81.66f),
                    PathNode.LineTo(98.83f, 106.83f),
                    PathNode.CurveTo(98.07973f, 107.581116f, 97.06164f, 108.00314f, 96.0f, 108.00314f),
                    PathNode.CurveTo(94.93836f, 108.00314f, 93.92027f, 107.581116f, 93.17f, 106.83f),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
