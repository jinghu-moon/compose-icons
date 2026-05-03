package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = phosphorFillIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 189.66f),
                    PathNode.LineTo(197.66f, 221.66f),
                    PathNode.CurveTo(196.15945f, 223.16223f, 194.12328f, 224.00629f, 192.0f, 224.00629f),
                    PathNode.CurveTo(189.87672f, 224.00629f, 187.84055f, 223.16223f, 186.34f, 221.66f),
                    PathNode.LineTo(154.34f, 189.66f),
                    PathNode.CurveTo(152.04936f, 187.3719f, 151.36368f, 183.92874f, 152.60303f, 180.93768f),
                    PathNode.CurveTo(153.84236f, 177.94662f, 156.76236f, 175.99745f, 160.0f, 176.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.LineTo(184.0f, 139.31f),
                    PathNode.LineTo(128.0f, 83.31f),
                    PathNode.LineTo(72.0f, 139.31f),
                    PathNode.LineTo(72.0f, 176.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.CurveTo(99.237656f, 175.99745f, 102.15764f, 177.94662f, 103.39698f, 180.93768f),
                    PathNode.CurveTo(104.63632f, 183.92874f, 103.95064f, 187.3719f, 101.66f, 189.66f),
                    PathNode.LineTo(69.66f, 221.66f),
                    PathNode.CurveTo(68.159454f, 223.16223f, 66.123276f, 224.00629f, 64.0f, 224.00629f),
                    PathNode.CurveTo(61.876724f, 224.00629f, 59.840546f, 223.16223f, 58.34f, 221.66f),
                    PathNode.LineTo(26.34f, 189.66f),
                    PathNode.CurveTo(24.049358f, 187.3719f, 23.36368f, 183.92874f, 24.60302f, 180.93768f),
                    PathNode.CurveTo(25.842361f, 177.94662f, 28.762346f, 175.99745f, 32.0f, 176.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(55.998333f, 133.87762f, 56.84009f, 131.84158f, 58.34f, 130.34f),
                    PathNode.LineTo(120.0f, 68.69f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.CurveTo(120.0f, 19.581722f, 123.58172f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(132.41827f, 16.0f, 136.0f, 19.581722f, 136.0f, 24.0f),
                    PathNode.LineTo(136.0f, 68.69f),
                    PathNode.LineTo(197.66f, 130.34f),
                    PathNode.CurveTo(199.15993f, 131.84158f, 200.00166f, 133.87762f, 200.0f, 136.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(227.23764f, 175.99745f, 230.15764f, 177.94662f, 231.39697f, 180.93768f),
                    PathNode.CurveTo(232.63632f, 183.92874f, 231.95064f, 187.3719f, 229.66f, 189.66f),
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
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
