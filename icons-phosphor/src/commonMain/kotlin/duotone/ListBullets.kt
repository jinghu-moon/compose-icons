package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorDuotoneIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 64.0f),
                    PathNode.CurveTo(80.0f, 59.581722f, 83.58172f, 56.0f, 88.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 68.41828f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(88.0f, 72.0f),
                    PathNode.CurveTo(83.58172f, 72.0f, 80.0f, 68.41828f, 80.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 120.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.CurveTo(83.58172f, 120.0f, 80.0f, 123.58172f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 132.41827f, 83.58172f, 136.0f, 88.0f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(220.41827f, 136.0f, 224.0f, 132.41827f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 123.58172f, 220.41827f, 120.0f, 216.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 184.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.CurveTo(83.58172f, 184.0f, 80.0f, 187.58173f, 80.0f, 192.0f),
                    PathNode.CurveTo(80.0f, 196.41827f, 83.58172f, 200.0f, 88.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(220.41827f, 200.0f, 224.0f, 196.41827f, 224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 187.58173f, 220.41827f, 184.0f, 216.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 52.0f),
                    PathNode.CurveTo(37.37258f, 52.0f, 32.0f, 57.37258f, 32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 70.62742f, 37.37258f, 76.0f, 44.0f, 76.0f),
                    PathNode.CurveTo(50.62742f, 76.0f, 56.0f, 70.62742f, 56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 57.37258f, 50.62742f, 52.0f, 44.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 116.0f),
                    PathNode.CurveTo(37.37258f, 116.0f, 32.0f, 121.37258f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 134.62741f, 37.37258f, 140.0f, 44.0f, 140.0f),
                    PathNode.CurveTo(50.62742f, 140.0f, 56.0f, 134.62741f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 121.37258f, 50.62742f, 116.0f, 44.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 180.0f),
                    PathNode.CurveTo(37.37258f, 180.0f, 32.0f, 185.37259f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 198.62741f, 37.37258f, 204.0f, 44.0f, 204.0f),
                    PathNode.CurveTo(50.62742f, 204.0f, 56.0f, 198.62741f, 56.0f, 192.0f),
                    PathNode.CurveTo(56.0f, 185.37259f, 50.62742f, 180.0f, 44.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
