package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Jar: ImageVector
    get() {
        if (_jar != null) return _jar!!
        _jar = phosphorThinIcon(
            name = "Jar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 52.23f),
                    PathNode.LineTo(180.0f, 32.0f),
                    PathNode.CurveTo(180.0f, 25.372583f, 174.62741f, 20.0f, 168.0f, 20.0f),
                    PathNode.LineTo(88.0f, 20.0f),
                    PathNode.CurveTo(81.37258f, 20.0f, 76.0f, 25.372583f, 76.0f, 32.0f),
                    PathNode.LineTo(76.0f, 52.23f),
                    PathNode.CurveTo(57.78185f, 54.26685f, 44.00361f, 69.668335f, 44.0f, 88.0f),
                    PathNode.LineTo(44.0f, 200.0f),
                    PathNode.CurveTo(44.0f, 219.88223f, 60.11775f, 236.0f, 80.0f, 236.0f),
                    PathNode.LineTo(176.0f, 236.0f),
                    PathNode.CurveTo(195.88223f, 236.0f, 212.0f, 219.88223f, 212.0f, 200.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(211.99638f, 69.668335f, 198.21815f, 54.26685f, 180.0f, 52.23f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 32.0f),
                    PathNode.LineTo(172.0f, 52.0f),
                    PathNode.LineTo(148.0f, 52.0f),
                    PathNode.LineTo(148.0f, 28.0f),
                    PathNode.LineTo(168.0f, 28.0f),
                    PathNode.CurveTo(170.20914f, 28.0f, 172.0f, 29.790861f, 172.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 52.0f),
                    PathNode.LineTo(116.0f, 28.0f),
                    PathNode.LineTo(140.0f, 28.0f),
                    PathNode.LineTo(140.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 28.0f),
                    PathNode.LineTo(108.0f, 28.0f),
                    PathNode.LineTo(108.0f, 52.0f),
                    PathNode.LineTo(84.0f, 52.0f),
                    PathNode.LineTo(84.0f, 32.0f),
                    PathNode.CurveTo(84.0f, 29.790861f, 85.79086f, 28.0f, 88.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 215.46397f, 191.46397f, 228.0f, 176.0f, 228.0f),
                    PathNode.LineTo(80.0f, 228.0f),
                    PathNode.CurveTo(64.536026f, 228.0f, 52.0f, 215.46397f, 52.0f, 200.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.CurveTo(52.0f, 72.536026f, 64.536026f, 60.0f, 80.0f, 60.0f),
                    PathNode.LineTo(176.0f, 60.0f),
                    PathNode.CurveTo(191.46397f, 60.0f, 204.0f, 72.536026f, 204.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _jar!!
    }

private var _jar: ImageVector? = null
