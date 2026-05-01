package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorRegularIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 180.41827f, 204.41827f, 184.0f, 200.0f, 184.0f),
                    PathNode.CurveTo(195.58173f, 184.0f, 192.0f, 180.41827f, 192.0f, 176.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 61.490334f, 170.50967f, 40.0f, 144.0f, 40.0f),
                    PathNode.CurveTo(117.49033f, 40.0f, 96.0f, 61.490334f, 96.0f, 88.0f),
                    PathNode.LineTo(96.0f, 204.69f),
                    PathNode.LineTo(130.34f, 170.34f),
                    PathNode.CurveTo(133.46593f, 167.21407f, 138.53407f, 167.21407f, 141.66f, 170.34f),
                    PathNode.CurveTo(144.78593f, 173.46593f, 144.78593f, 178.53407f, 141.66f, 181.66f),
                    PathNode.LineTo(93.66f, 229.66f),
                    PathNode.CurveTo(92.159454f, 231.16223f, 90.123276f, 232.00629f, 88.0f, 232.00629f),
                    PathNode.CurveTo(85.876724f, 232.00629f, 83.840546f, 231.16223f, 82.34f, 229.66f),
                    PathNode.LineTo(34.34f, 181.66f),
                    PathNode.CurveTo(31.214067f, 178.53407f, 31.21407f, 173.46593f, 34.34f, 170.34f),
                    PathNode.CurveTo(37.46593f, 167.21407f, 42.53407f, 167.21407f, 45.66f, 170.34f),
                    PathNode.LineTo(80.0f, 204.69f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.CurveTo(80.0f, 52.653774f, 108.65378f, 24.0f, 144.0f, 24.0f),
                    PathNode.CurveTo(179.34622f, 24.0f, 208.0f, 52.653774f, 208.0f, 88.0f),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
