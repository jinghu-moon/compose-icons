package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorRegularIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 173.66f),
                    PathNode.LineTo(181.66f, 221.66f),
                    PathNode.CurveTo(178.53407f, 224.78593f, 173.46593f, 224.78593f, 170.34f, 221.66f),
                    PathNode.CurveTo(167.21407f, 218.53407f, 167.21407f, 213.46593f, 170.34f, 210.34f),
                    PathNode.LineTo(204.69f, 176.0f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.CurveTo(52.653774f, 176.0f, 24.0f, 147.34622f, 24.0f, 112.0f),
                    PathNode.CurveTo(24.0f, 76.65378f, 52.653774f, 48.0f, 88.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(180.41827f, 48.0f, 184.0f, 51.581722f, 184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 60.418278f, 180.41827f, 64.0f, 176.0f, 64.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.CurveTo(61.490334f, 64.0f, 40.0f, 85.49033f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 138.50967f, 61.490334f, 160.0f, 88.0f, 160.0f),
                    PathNode.LineTo(204.69f, 160.0f),
                    PathNode.LineTo(170.34f, 125.66f),
                    PathNode.CurveTo(167.21407f, 122.534065f, 167.21407f, 117.465935f, 170.34f, 114.34f),
                    PathNode.CurveTo(173.46593f, 111.214066f, 178.53407f, 111.214066f, 181.66f, 114.34f),
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
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
