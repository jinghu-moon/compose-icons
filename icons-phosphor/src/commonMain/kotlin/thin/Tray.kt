package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tray: ImageVector
    get() {
        if (_tray != null) return _tray!!
        _tray = phosphorThinIcon(
            name = "Tray",
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
                    PathNode.CurveTo(176.12991f, 156.00015f, 173.07991f, 157.26259f, 170.83f, 159.51f),
                    PathNode.LineTo(151.51f, 178.83f),
                    PathNode.CurveTo(150.76166f, 179.57751f, 149.74773f, 179.9982f, 148.69f, 180.0f),
                    PathNode.LineTo(107.31f, 180.0f),
                    PathNode.CurveTo(106.25228f, 179.9982f, 105.238335f, 179.57751f, 104.49f, 178.83f),
                    PathNode.LineTo(85.17f, 159.51f),
                    PathNode.CurveTo(82.92008f, 157.26259f, 79.870094f, 156.00015f, 76.69f, 156.0f),
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
                    PathNode.LineTo(98.83f, 184.49f),
                    PathNode.CurveTo(101.07992f, 186.73741f, 104.129906f, 187.99985f, 107.31f, 188.0f),
                    PathNode.LineTo(148.69f, 188.0f),
                    PathNode.CurveTo(151.87009f, 187.99985f, 154.92009f, 186.73741f, 157.17f, 184.49f),
                    PathNode.LineTo(176.49f, 165.17f),
                    PathNode.CurveTo(177.23834f, 164.42249f, 178.25227f, 164.0018f, 179.31f, 164.0f),
                    PathNode.LineTo(212.0f, 164.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
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
        return _tray!!
    }

private var _tray: ImageVector? = null
