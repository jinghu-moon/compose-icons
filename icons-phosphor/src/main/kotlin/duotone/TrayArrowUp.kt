package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorDuotoneIcon(
            name = "TrayArrowUp",
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
                    PathNode.LineTo(88.0f, 156.69f),
                    PathNode.CurveTo(85.00975f, 153.67581f, 80.93579f, 151.98643f, 76.69f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.LineTo(76.69f, 168.0f),
                    PathNode.LineTo(96.0f, 187.31f),
                    PathNode.CurveTo(98.99025f, 190.32419f, 103.06421f, 192.01357f, 107.31f, 192.0f),
                    PathNode.LineTo(148.69f, 192.0f),
                    PathNode.CurveTo(152.93579f, 192.01357f, 157.00975f, 190.32419f, 160.0f, 187.31f),
                    PathNode.LineTo(179.31f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.34f, 109.66f),
                    PathNode.CurveTo(88.83778f, 108.159454f, 87.993706f, 106.123276f, 87.993706f, 104.0f),
                    PathNode.CurveTo(87.993706f, 101.876724f, 88.83778f, 99.840546f, 90.34f, 98.34f),
                    PathNode.LineTo(122.34f, 66.34f),
                    PathNode.CurveTo(123.840546f, 64.83778f, 125.876724f, 63.993706f, 128.0f, 63.993706f),
                    PathNode.CurveTo(130.12328f, 63.993706f, 132.15945f, 64.83778f, 133.66f, 66.34f),
                    PathNode.LineTo(165.66f, 98.34f),
                    PathNode.CurveTo(168.78593f, 101.465935f, 168.78593f, 106.534065f, 165.66f, 109.66f),
                    PathNode.CurveTo(162.53407f, 112.785934f, 157.46593f, 112.785934f, 154.34f, 109.66f),
                    PathNode.LineTo(136.0f, 91.31f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.CurveTo(136.0f, 156.41827f, 132.41827f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(123.58172f, 160.0f, 120.0f, 156.41827f, 120.0f, 152.0f),
                    PathNode.LineTo(120.0f, 91.31f),
                    PathNode.LineTo(101.66f, 109.66f),
                    PathNode.CurveTo(100.159454f, 111.16222f, 98.123276f, 112.006294f, 96.0f, 112.006294f),
                    PathNode.CurveTo(93.876724f, 112.006294f, 91.840546f, 111.16222f, 90.34f, 109.66f),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
