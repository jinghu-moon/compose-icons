package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorFillIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 96.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(151.99745f, 44.76235f, 153.94662f, 41.84236f, 156.93768f, 40.60302f),
                    PathNode.CurveTo(159.92874f, 39.363674f, 163.3719f, 40.04936f, 165.66f, 42.34f),
                    PathNode.LineTo(213.66f, 90.34f),
                    PathNode.CurveTo(215.95064f, 92.62809f, 216.63632f, 96.07126f, 215.39697f, 99.062325f),
                    PathNode.CurveTo(214.15764f, 102.05338f, 211.23764f, 104.00255f, 208.0f, 104.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.CurveTo(155.58173f, 104.0f, 152.0f, 100.41828f, 152.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.CurveTo(44.76235f, 151.99745f, 41.84236f, 153.94662f, 40.60302f, 156.93768f),
                    PathNode.CurveTo(39.363674f, 159.92874f, 40.04936f, 163.3719f, 42.34f, 165.66f),
                    PathNode.LineTo(90.34f, 213.66f),
                    PathNode.CurveTo(92.62809f, 215.95064f, 96.07126f, 216.63632f, 99.062325f, 215.39697f),
                    PathNode.CurveTo(102.05338f, 214.15764f, 104.00255f, 211.23764f, 104.0f, 208.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.CurveTo(104.0f, 155.58173f, 100.41828f, 152.0f, 96.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(99.06f, 40.61f),
                    PathNode.CurveTo(96.07096f, 39.369938f, 92.62924f, 40.052757f, 90.34f, 42.34f),
                    PathNode.LineTo(42.34f, 90.34f),
                    PathNode.CurveTo(40.04936f, 92.62809f, 39.363674f, 96.07126f, 40.60302f, 99.062325f),
                    PathNode.CurveTo(41.84236f, 102.05338f, 44.76235f, 104.00255f, 48.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.CurveTo(100.41828f, 104.0f, 104.0f, 100.41828f, 104.0f, 96.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.CurveTo(103.99934f, 44.764324f, 102.04962f, 41.847645f, 99.06f, 40.61f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(155.58173f, 152.0f, 152.0f, 155.58173f, 152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.CurveTo(151.99745f, 211.23764f, 153.94662f, 214.15764f, 156.93768f, 215.39697f),
                    PathNode.CurveTo(159.92874f, 216.63632f, 163.3719f, 215.95064f, 165.66f, 213.66f),
                    PathNode.LineTo(213.66f, 165.66f),
                    PathNode.CurveTo(215.95064f, 163.3719f, 216.63632f, 159.92874f, 215.39697f, 156.93768f),
                    PathNode.CurveTo(214.15764f, 153.94662f, 211.23764f, 151.99745f, 208.0f, 152.0f),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
