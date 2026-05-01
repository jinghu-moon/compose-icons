package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Tray: ImageVector
    get() {
        if (_tray != null) return _tray!!
        _tray = phosphorDuotoneIcon(
            name = "Tray",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(179.31f, 160.0f),
                    PathNode.CurveTo(177.18762f, 159.99834f, 175.15158f, 160.84007f, 173.65f, 162.34f),
                    PathNode.LineTo(154.34f, 181.66f),
                    PathNode.CurveTo(152.83842f, 183.15993f, 150.80237f, 184.00166f, 148.68f, 184.0f),
                    PathNode.LineTo(107.31f, 184.0f),
                    PathNode.CurveTo(105.18763f, 184.00166f, 103.15157f, 183.15993f, 101.65f, 181.66f),
                    PathNode.LineTo(82.34f, 162.34f),
                    PathNode.CurveTo(80.838425f, 160.84007f, 78.80237f, 159.99834f, 76.68f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(40.0f, 43.581722f, 43.581722f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
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
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.LineTo(179.3f, 152.0f),
                    PathNode.CurveTo(175.05768f, 151.98912f, 170.98781f, 153.67828f, 168.0f, 156.69f),
                    PathNode.LineTo(148.69f, 176.0f),
                    PathNode.LineTo(107.31f, 176.0f),
                    PathNode.LineTo(88.0f, 156.68f),
                    PathNode.CurveTo(85.006195f, 153.67232f, 80.933685f, 151.98715f, 76.69f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.LineTo(76.69f, 168.0f),
                    PathNode.LineTo(96.0f, 187.32f),
                    PathNode.CurveTo(98.993805f, 190.32768f, 103.066315f, 192.01285f, 107.31f, 192.0f),
                    PathNode.LineTo(148.69f, 192.0f),
                    PathNode.CurveTo(152.93579f, 192.01357f, 157.00975f, 190.32419f, 160.0f, 187.31f),
                    PathNode.LineTo(179.31f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 208.0f),
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
        return _tray!!
    }

private var _tray: ImageVector? = null
