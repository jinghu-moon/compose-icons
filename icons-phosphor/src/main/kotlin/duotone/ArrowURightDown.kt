package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorDuotoneIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 176.0f),
                    PathNode.LineTo(168.0f, 224.0f),
                    PathNode.LineTo(120.0f, 176.0f),
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
                    PathNode.MoveTo(223.39f, 172.94f),
                    PathNode.CurveTo(222.15236f, 169.95038f, 219.23566f, 168.00067f, 216.0f, 168.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(176.0f, 52.653774f, 147.34622f, 24.0f, 112.0f, 24.0f),
                    PathNode.CurveTo(76.65378f, 24.0f, 48.0f, 52.653774f, 48.0f, 88.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 180.41827f, 51.581722f, 184.0f, 56.0f, 184.0f),
                    PathNode.CurveTo(60.418278f, 184.0f, 64.0f, 180.41827f, 64.0f, 176.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.CurveTo(64.0f, 61.490334f, 85.49033f, 40.0f, 112.0f, 40.0f),
                    PathNode.CurveTo(138.50967f, 40.0f, 160.0f, 61.490334f, 160.0f, 88.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.CurveTo(116.762344f, 167.99745f, 113.84236f, 169.94662f, 112.60302f, 172.93768f),
                    PathNode.CurveTo(111.36368f, 175.92874f, 112.04936f, 179.3719f, 114.34f, 181.66f),
                    PathNode.LineTo(162.34f, 229.66f),
                    PathNode.CurveTo(163.84055f, 231.16223f, 165.87672f, 232.00629f, 168.0f, 232.00629f),
                    PathNode.CurveTo(170.12328f, 232.00629f, 172.15945f, 231.16223f, 173.66f, 229.66f),
                    PathNode.LineTo(221.66f, 181.66f),
                    PathNode.CurveTo(223.94725f, 179.37076f, 224.63007f, 175.92903f, 223.39f, 172.94f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 212.69f),
                    PathNode.LineTo(139.31f, 184.0f),
                    PathNode.LineTo(196.69f, 184.0f),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
