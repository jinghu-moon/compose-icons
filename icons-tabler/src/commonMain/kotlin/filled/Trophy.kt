package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = tablerFilledIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.0f),
                    PathNode.CurveTo(17.506975f, 3.000067f, 17.933683f, 3.379507f, 17.993f, 3.883f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.LineTo(18.0f, 6.17f),
                    PathNode.CurveTo(19.242937f, 5.732056f, 20.626146f, 6.156536f, 21.409468f, 7.2163f),
                    PathNode.CurveTo(22.19279f, 8.276063f, 22.19279f, 9.722937f, 21.409468f, 10.782701f),
                    PathNode.CurveTo(20.626146f, 11.842464f, 19.242937f, 12.266944f, 18.0f, 11.829f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.CurveTo(17.999624f, 14.927865f, 15.886776f, 17.42821f, 13.0f, 17.917f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.529093f, 20.000587f, 16.966166f, 20.41321f, 16.997171f, 20.941395f),
                    PathNode.CurveTo(17.02818f, 21.46958f, 16.642391f, 21.93051f, 16.117f, 21.993f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(7.470907f, 21.999413f, 7.033836f, 21.58679f, 7.002828f, 21.058605f),
                    PathNode.CurveTo(6.971821f, 20.53042f, 7.35761f, 20.06949f, 7.883f, 20.007f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.LineTo(11.0f, 17.917f),
                    PathNode.CurveTo(8.196707f, 17.442467f, 6.110968f, 15.06616f, 6.004f, 12.225f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.LineTo(6.0f, 11.829f),
                    PathNode.CurveTo(5.110822f, 12.143764f, 4.125381f, 12.022008f, 3.339555f, 11.500287f),
                    PathNode.CurveTo(2.55373f, 10.978567f, 2.059033f, 10.11764f, 2.004f, 9.176f),
                    PathNode.LineTo(2.001f, 9.0f),
                    PathNode.LineTo(2.006f, 8.824f),
                    PathNode.CurveTo(2.06083f, 7.882431f, 2.555263f, 7.021462f, 3.34087f, 6.499559f),
                    PathNode.CurveTo(4.126476f, 5.977657f, 5.111784f, 5.855589f, 6.001f, 6.17f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.CurveTo(6.0f, 3.447715f, 6.447716f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(5.0f, 8.0f),
                    PathNode.CurveTo(4.447716f, 8.0f, 4.0f, 8.447715f, 4.0f, 9.0f),
                    PathNode.CurveTo(4.0f, 9.552285f, 4.447716f, 10.0f, 5.0f, 10.0f),
                    PathNode.CurveTo(5.552285f, 10.0f, 6.0f, 9.552285f, 6.0f, 9.0f),
                    PathNode.CurveTo(6.0f, 8.447715f, 5.552285f, 8.0f, 5.0f, 8.0f),
                    PathNode.MoveTo(19.0f, 8.0f),
                    PathNode.CurveTo(18.447716f, 8.0f, 18.0f, 8.447715f, 18.0f, 9.0f),
                    PathNode.CurveTo(18.0f, 9.552285f, 18.447716f, 10.0f, 19.0f, 10.0f),
                    PathNode.CurveTo(19.552284f, 10.0f, 20.0f, 9.552285f, 20.0f, 9.0f),
                    PathNode.CurveTo(20.0f, 8.447715f, 19.552284f, 8.0f, 19.0f, 8.0f)
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
