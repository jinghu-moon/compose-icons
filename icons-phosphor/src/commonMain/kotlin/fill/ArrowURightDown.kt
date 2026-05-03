package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorFillIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 181.66f),
                    PathNode.LineTo(173.66f, 229.66f),
                    PathNode.CurveTo(172.15945f, 231.16223f, 170.12328f, 232.00629f, 168.0f, 232.00629f),
                    PathNode.CurveTo(165.87672f, 232.00629f, 163.84055f, 231.16223f, 162.34f, 229.66f),
                    PathNode.LineTo(114.34f, 181.66f),
                    PathNode.CurveTo(112.04936f, 179.3719f, 111.36368f, 175.92874f, 112.60302f, 172.93768f),
                    PathNode.CurveTo(113.84236f, 169.94662f, 116.762344f, 167.99745f, 120.0f, 168.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(160.0f, 61.490334f, 138.50967f, 40.0f, 112.0f, 40.0f),
                    PathNode.CurveTo(85.49033f, 40.0f, 64.0f, 61.490334f, 64.0f, 88.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 180.41827f, 60.418278f, 184.0f, 56.0f, 184.0f),
                    PathNode.CurveTo(51.581722f, 184.0f, 48.0f, 180.41827f, 48.0f, 176.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(48.0f, 52.653774f, 76.65378f, 24.0f, 112.0f, 24.0f),
                    PathNode.CurveTo(147.34622f, 24.0f, 176.0f, 52.653774f, 176.0f, 88.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(219.23764f, 167.99745f, 222.15764f, 169.94662f, 223.39697f, 172.93768f),
                    PathNode.CurveTo(224.63632f, 175.92874f, 223.95064f, 179.3719f, 221.66f, 181.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
