package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorDuotoneIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 152.0f),
                    PathNode.LineTo(24.0f, 152.0f),
                    PathNode.LineTo(24.0f, 88.0f),
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
                    PathNode.MoveTo(201.54f, 110.46f),
                    PathNode.CurveTo(161.56915f, 70.49513f, 96.99674f, 69.77124f, 56.14f, 108.83f),
                    PathNode.LineTo(29.66f, 82.34f),
                    PathNode.CurveTo(27.371908f, 80.04936f, 23.92874f, 79.36368f, 20.93768f, 80.60302f),
                    PathNode.CurveTo(17.94662f, 81.84236f, 15.997452f, 84.762344f, 16.0f, 88.0f),
                    PathNode.LineTo(16.0f, 152.0f),
                    PathNode.CurveTo(16.0f, 156.41827f, 19.581722f, 160.0f, 24.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.CurveTo(91.237656f, 160.00255f, 94.15764f, 158.05338f, 95.39698f, 155.06232f),
                    PathNode.CurveTo(96.63632f, 152.07126f, 95.95064f, 148.6281f, 93.66f, 146.34f),
                    PathNode.LineTo(67.47f, 120.16f),
                    PathNode.CurveTo(92.988365f, 95.97828f, 130.45073f, 89.30494f, 162.74963f, 103.1874f),
                    PathNode.CurveTo(195.04854f, 117.06987f, 215.9857f, 148.84402f, 216.0f, 184.0f),
                    PathNode.CurveTo(216.0f, 188.41827f, 219.58173f, 192.0f, 224.0f, 192.0f),
                    PathNode.CurveTo(228.41827f, 192.0f, 232.0f, 188.41827f, 232.0f, 184.0f),
                    PathNode.CurveTo(232.07463f, 156.4026f, 221.1065f, 129.9221f, 201.54f, 110.46f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 144.0f),
                    PathNode.LineTo(32.0f, 107.31f),
                    PathNode.LineTo(68.69f, 144.0f),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
