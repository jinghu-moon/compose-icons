package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandBitbucket: ImageVector
    get() {
        if (_brandBitbucket != null) return _brandBitbucket!!
        _brandBitbucket = tablerFilledIcon(
            name = "BrandBitbucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.661f, 3.0f),
                    PathNode.LineTo(20.341f, 3.007f),
                    PathNode.CurveTo(20.825f, 3.002f, 21.287f, 3.21f, 21.603f, 3.577f),
                    PathNode.CurveTo(21.919f, 3.945f, 22.057f, 4.433f, 21.967f, 4.973f),
                    PathNode.LineTo(18.629f, 19.624f),
                    PathNode.CurveTo(18.498981f, 20.42126f, 17.807775f, 21.005114f, 17.0f, 21.0f),
                    PathNode.LineTo(6.99f, 21.0f),
                    PathNode.CurveTo(6.084f, 20.991f, 5.312f, 20.332f, 5.17f, 19.483f),
                    PathNode.LineTo(2.022f, 4.907f),
                    PathNode.CurveTo(1.942952f, 4.428185f, 2.080026f, 3.938947f, 2.396345f, 3.570905f),
                    PathNode.CurveTo(2.712664f, 3.202863f, 3.175743f, 2.993815f, 3.661f, 3.0f),
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.CurveTo(8.706199f, 8.000136f, 8.427321f, 8.129465f, 8.237422f, 8.353647f),
                    PathNode.CurveTo(8.047523f, 8.577827f, 7.965817f, 8.874177f, 8.014f, 9.164f),
                    PathNode.LineTo(9.014f, 15.164f),
                    PathNode.CurveTo(9.094166f, 15.646199f, 9.511182f, 15.999775f, 10.0f, 16.0f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.CurveTo(14.488818f, 15.999775f, 14.905834f, 15.646199f, 14.986f, 15.164f),
                    PathNode.LineTo(15.986f, 9.164f),
                    PathNode.CurveTo(16.034184f, 8.874177f, 15.952477f, 8.577827f, 15.762578f, 8.353647f),
                    PathNode.CurveTo(15.572679f, 8.129465f, 15.293801f, 8.000136f, 15.0f, 8.0f)
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
        return _brandBitbucket!!
    }

private var _brandBitbucket: ImageVector? = null
