package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorFillIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.61f, 83.06f),
                    PathNode.CurveTo(71.369934f, 80.07096f, 72.05276f, 76.62924f, 74.34f, 74.34f),
                    PathNode.LineTo(122.34f, 26.34f),
                    PathNode.CurveTo(123.840546f, 24.837784f, 125.876724f, 23.993708f, 128.0f, 23.993708f),
                    PathNode.CurveTo(130.12328f, 23.993708f, 132.15945f, 24.837784f, 133.66f, 26.34f),
                    PathNode.LineTo(181.66f, 74.34f),
                    PathNode.CurveTo(183.95064f, 76.62809f, 184.63632f, 80.07126f, 183.39697f, 83.062325f),
                    PathNode.CurveTo(182.15764f, 86.05338f, 179.23764f, 88.00255f, 176.0f, 88.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.CurveTo(76.76432f, 87.99934f, 73.84765f, 86.04962f, 72.61f, 83.06f),
                    PathNode.Close,
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
