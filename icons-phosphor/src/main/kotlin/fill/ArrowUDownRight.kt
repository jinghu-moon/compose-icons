package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorFillIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 173.66f),
                    PathNode.LineTo(181.66f, 221.66f),
                    PathNode.CurveTo(179.3719f, 223.95064f, 175.92874f, 224.63632f, 172.93768f, 223.39697f),
                    PathNode.CurveTo(169.94662f, 222.15764f, 167.99745f, 219.23764f, 168.0f, 216.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.CurveTo(52.653774f, 176.0f, 24.0f, 147.34622f, 24.0f, 112.0f),
                    PathNode.CurveTo(24.0f, 76.65378f, 52.653774f, 48.0f, 88.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(180.41827f, 48.0f, 184.0f, 51.581722f, 184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 60.418278f, 180.41827f, 64.0f, 176.0f, 64.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.CurveTo(61.490334f, 64.0f, 40.0f, 85.49033f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 138.50967f, 61.490334f, 160.0f, 88.0f, 160.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(167.99745f, 116.762344f, 169.94662f, 113.84236f, 172.93768f, 112.60302f),
                    PathNode.CurveTo(175.92874f, 111.36368f, 179.3719f, 112.04936f, 181.66f, 114.34f),
                    PathNode.LineTo(229.66f, 162.34f),
                    PathNode.CurveTo(231.16223f, 163.84055f, 232.00629f, 165.87672f, 232.00629f, 168.0f),
                    PathNode.CurveTo(232.00629f, 170.12328f, 231.16223f, 172.15945f, 229.66f, 173.66f),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
