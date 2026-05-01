package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorRegularIcon(
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
                    PathNode.CurveTo(111.214066f, 178.53407f, 111.214066f, 173.46593f, 114.34f, 170.34f),
                    PathNode.CurveTo(117.465935f, 167.21407f, 122.534065f, 167.21407f, 125.66f, 170.34f),
                    PathNode.LineTo(160.0f, 204.69f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(160.0f, 61.490334f, 138.50967f, 40.0f, 112.0f, 40.0f),
                    PathNode.CurveTo(85.49033f, 40.0f, 64.0f, 61.490334f, 64.0f, 88.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 180.41827f, 60.418278f, 184.0f, 56.0f, 184.0f),
                    PathNode.CurveTo(51.581722f, 184.0f, 48.0f, 180.41827f, 48.0f, 176.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(48.0f, 52.653774f, 76.65378f, 24.0f, 112.0f, 24.0f),
                    PathNode.CurveTo(147.34622f, 24.0f, 176.0f, 52.653774f, 176.0f, 88.0f),
                    PathNode.LineTo(176.0f, 204.69f),
                    PathNode.LineTo(210.34f, 170.34f),
                    PathNode.CurveTo(213.46593f, 167.21407f, 218.53407f, 167.21407f, 221.66f, 170.34f),
                    PathNode.CurveTo(224.78593f, 173.46593f, 224.78593f, 178.53407f, 221.66f, 181.66f),
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
