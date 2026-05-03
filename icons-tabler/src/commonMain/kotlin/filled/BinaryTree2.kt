package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BinaryTree2: ImageVector
    get() {
        if (_binaryTree2 != null) return _binaryTree2!!
        _binaryTree2 = tablerFilledIcon(
            name = "BinaryTree2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(13.06578f, 2.999704f, 14.051703f, 3.564879f, 14.590024f, 4.484715f),
                    PathNode.CurveTo(15.128345f, 5.404551f, 15.138232f, 6.540936f, 14.616f, 7.47f),
                    PathNode.LineTo(17.89f, 11.212f),
                    PathNode.CurveTo(19.247198f, 10.670986f, 20.796774f, 11.18638f, 21.55956f, 12.43251f),
                    PathNode.CurveTo(22.322348f, 13.678639f, 22.076488f, 15.293065f, 20.977339f, 16.255642f),
                    PathNode.CurveTo(19.87819f, 17.21822f, 18.245441f, 17.24898f, 17.110815f, 16.32849f),
                    PathNode.CurveTo(15.976189f, 15.407996f, 15.669693f, 13.803977f, 16.385f, 12.53f),
                    PathNode.LineTo(13.11f, 8.787f),
                    PathNode.LineTo(13.0f, 8.829f),
                    PathNode.LineTo(13.0f, 15.171f),
                    PathNode.CurveTo(14.378126f, 15.658058f, 15.204896f, 17.067162f, 14.957811f, 18.507788f),
                    PathNode.CurveTo(14.710726f, 19.948416f, 13.461662f, 21.001488f, 12.0f, 21.001488f),
                    PathNode.CurveTo(10.538338f, 21.001488f, 9.289274f, 19.948416f, 9.042189f, 18.507788f),
                    PathNode.CurveTo(8.795104f, 17.067162f, 9.621874f, 15.658058f, 11.0f, 15.171f),
                    PathNode.LineTo(11.0f, 8.829f),
                    PathNode.LineTo(10.889f, 8.788f),
                    PathNode.LineTo(7.615f, 12.53f),
                    PathNode.CurveTo(8.330307f, 13.803977f, 8.023812f, 15.407996f, 6.889186f, 16.32849f),
                    PathNode.CurveTo(5.754559f, 17.24898f, 4.121809f, 17.21822f, 3.022661f, 16.255642f),
                    PathNode.CurveTo(1.923512f, 15.293065f, 1.677652f, 13.678639f, 2.440439f, 12.43251f),
                    PathNode.CurveTo(3.203226f, 11.18638f, 4.752803f, 10.670986f, 6.11f, 11.212f),
                    PathNode.LineTo(9.383f, 7.47f),
                    PathNode.CurveTo(8.86068f, 6.54078f, 8.870665f, 5.404184f, 9.409228f, 4.484283f),
                    PathNode.CurveTo(9.947792f, 3.564382f, 10.934041f, 2.999349f, 12.0f, 3.0f)
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
        return _binaryTree2!!
    }

private var _binaryTree2: ImageVector? = null
