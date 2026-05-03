package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorFillIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 136.0f),
                    PathNode.LineTo(240.0f, 168.0f),
                    PathNode.CurveTo(240.0f, 172.41827f, 236.41827f, 176.0f, 232.0f, 176.0f),
                    PathNode.CurveTo(231.47253f, 176.00122f, 230.94638f, 175.9476f, 230.43f, 175.84f),
                    PathNode.LineTo(156.0f, 161.0f),
                    PathNode.LineTo(156.0f, 184.73f),
                    PathNode.LineTo(173.66f, 202.38f),
                    PathNode.CurveTo(175.15015f, 203.87177f, 175.9911f, 205.8915f, 176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 232.0f),
                    PathNode.CurveTo(176.0046f, 234.66254f, 174.68425f, 237.1529f, 172.47786f, 238.6432f),
                    PathNode.CurveTo(170.27148f, 240.13351f, 167.46825f, 240.42845f, 165.0f, 239.43f),
                    PathNode.LineTo(128.0f, 224.62f),
                    PathNode.LineTo(91.0f, 239.43f),
                    PathNode.CurveTo(88.53175f, 240.42845f, 85.728516f, 240.13351f, 83.52213f, 238.6432f),
                    PathNode.CurveTo(81.31575f, 237.1529f, 79.99541f, 234.66254f, 80.0f, 232.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.CurveTo(79.99833f, 205.87762f, 80.84009f, 203.84158f, 82.34f, 202.34f),
                    PathNode.LineTo(100.0f, 184.69f),
                    PathNode.LineTo(100.0f, 161.0f),
                    PathNode.LineTo(25.57f, 175.84f),
                    PathNode.CurveTo(25.053625f, 175.9476f, 24.527464f, 176.00122f, 24.0f, 176.0f),
                    PathNode.CurveTo(19.581722f, 176.0f, 16.0f, 172.41827f, 16.0f, 168.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.CurveTo(15.997829f, 132.96869f, 17.70914f, 130.19652f, 20.42f, 128.84f),
                    PathNode.LineTo(100.0f, 89.06f),
                    PathNode.LineTo(100.0f, 44.0f),
                    PathNode.CurveTo(100.0f, 28.536028f, 112.536026f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(143.46397f, 16.0f, 156.0f, 28.536028f, 156.0f, 44.0f),
                    PathNode.LineTo(156.0f, 89.06f),
                    PathNode.LineTo(235.58f, 128.84f),
                    PathNode.CurveTo(238.29086f, 130.19652f, 240.00217f, 132.96869f, 240.0f, 136.0f),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
