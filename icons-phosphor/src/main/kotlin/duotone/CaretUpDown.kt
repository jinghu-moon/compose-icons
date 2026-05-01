package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorDuotoneIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 176.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(176.0f, 80.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 168.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.CurveTo(76.762344f, 167.99745f, 73.84236f, 169.94662f, 72.60302f, 172.93768f),
                    PathNode.CurveTo(71.36368f, 175.92874f, 72.04936f, 179.3719f, 74.34f, 181.66f),
                    PathNode.LineTo(122.34f, 229.66f),
                    PathNode.CurveTo(123.840546f, 231.16223f, 125.876724f, 232.00629f, 128.0f, 232.00629f),
                    PathNode.CurveTo(130.12328f, 232.00629f, 132.15945f, 231.16223f, 133.66f, 229.66f),
                    PathNode.LineTo(181.66f, 181.66f),
                    PathNode.CurveTo(183.95064f, 179.3719f, 184.63632f, 175.92874f, 183.39697f, 172.93768f),
                    PathNode.CurveTo(182.15764f, 169.94662f, 179.23764f, 167.99745f, 176.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.69f),
                    PathNode.LineTo(99.31f, 184.0f),
                    PathNode.LineTo(156.69f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 88.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(179.23764f, 88.00255f, 182.15764f, 86.05338f, 183.39697f, 83.062325f),
                    PathNode.CurveTo(184.63632f, 80.07126f, 183.95064f, 76.62809f, 181.66f, 74.34f),
                    PathNode.LineTo(133.66f, 26.34f),
                    PathNode.CurveTo(132.15945f, 24.837784f, 130.12328f, 23.993708f, 128.0f, 23.993708f),
                    PathNode.CurveTo(125.876724f, 23.993708f, 123.840546f, 24.837784f, 122.34f, 26.34f),
                    PathNode.LineTo(74.34f, 74.34f),
                    PathNode.CurveTo(72.04936f, 76.62809f, 71.36368f, 80.07126f, 72.60302f, 83.062325f),
                    PathNode.CurveTo(73.84236f, 86.05338f, 76.762344f, 88.00255f, 80.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 43.31f),
                    PathNode.LineTo(156.69f, 72.0f),
                    PathNode.LineTo(99.31f, 72.0f),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
