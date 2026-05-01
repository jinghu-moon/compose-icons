package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = phosphorDuotoneIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(128.0f, 176.0f),
                    PathNode.LineTo(48.0f, 96.0f),
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
                    PathNode.MoveTo(215.39f, 92.94f),
                    PathNode.CurveTo(214.15236f, 89.95038f, 211.23566f, 88.00066f, 208.0f, 88.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(44.76235f, 87.99745f, 41.84236f, 89.94662f, 40.60302f, 92.937675f),
                    PathNode.CurveTo(39.363674f, 95.92874f, 40.04936f, 99.37191f, 42.34f, 101.66f),
                    PathNode.LineTo(122.34f, 181.66f),
                    PathNode.CurveTo(123.840546f, 183.16223f, 125.876724f, 184.00629f, 128.0f, 184.00629f),
                    PathNode.CurveTo(130.12328f, 184.00629f, 132.15945f, 183.16223f, 133.66f, 181.66f),
                    PathNode.LineTo(213.66f, 101.66f),
                    PathNode.CurveTo(215.94725f, 99.37076f, 216.63007f, 95.92904f, 215.39f, 92.94f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.69f),
                    PathNode.LineTo(67.31f, 104.0f),
                    PathNode.LineTo(188.69f, 104.0f),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
