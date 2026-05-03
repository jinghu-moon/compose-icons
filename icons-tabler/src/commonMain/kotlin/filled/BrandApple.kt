package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandApple: ImageVector
    get() {
        if (_brandApple != null) return _brandApple!!
        _brandApple = tablerFilledIcon(
            name = "BrandApple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.079f, 5.999f),
                    PathNode.LineTo(15.318f, 6.011f),
                    PathNode.CurveTo(16.748f, 6.108f, 18.752f, 7.024f, 19.826f, 8.597f),
                    PathNode.CurveTo(19.984938f, 8.829836f, 20.038214f, 9.118941f, 19.972712f, 9.393136f),
                    PathNode.CurveTo(19.90721f, 9.667332f, 19.729013f, 9.901141f, 19.482f, 10.037f),
                    PathNode.CurveTo(19.432f, 10.065f, 19.11f, 10.195f, 18.985f, 10.254f),
                    PathNode.CurveTo(18.730362f, 10.372851f, 18.488453f, 10.51726f, 18.263f, 10.685f),
                    PathNode.CurveTo(17.649f, 11.146f, 17.315f, 11.694f, 17.321f, 12.379f),
                    PathNode.CurveTo(17.331f, 13.264f, 17.66f, 13.833f, 18.228f, 14.225f),
                    PathNode.CurveTo(18.436f, 14.368f, 18.664f, 14.478f, 18.894f, 14.555f),
                    PathNode.CurveTo(19.02f, 14.598f, 19.32f, 14.671f, 19.338f, 14.677f),
                    PathNode.CurveTo(19.735426f, 14.81973f, 20.00036f, 15.196721f, 20.0f, 15.619f),
                    PathNode.CurveTo(20.0f, 18.24f, 16.96f, 22.0f, 14.714f, 22.0f),
                    PathNode.CurveTo(13.924f, 22.0f, 13.442f, 21.909f, 12.731f, 21.685f),
                    PathNode.LineTo(12.633f, 21.654f),
                    PathNode.CurveTo(12.17f, 21.508f, 11.931f, 21.462f, 11.5f, 21.462f),
                    PathNode.CurveTo(10.98f, 21.462f, 10.637f, 21.522f, 9.982f, 21.699f),
                    PathNode.LineTo(9.785f, 21.752f),
                    PathNode.CurveTo(9.21f, 21.905f, 8.821f, 21.978f, 8.285f, 22.0f),
                    PathNode.CurveTo(5.536f, 22.0f, 3.0f, 16.907f, 3.0f, 12.928f),
                    PathNode.CurveTo(3.0f, 9.058f, 4.786f, 6.008f, 8.286001f, 6.008f),
                    PathNode.CurveTo(8.583f, 6.008f, 8.884f, 6.053f, 9.195f, 6.136f),
                    PathNode.CurveTo(9.598f, 6.243f, 9.969f, 6.396f, 10.491f, 6.644f),
                    PathNode.CurveTo(11.278f, 7.018f, 11.439f, 7.084f, 11.5f, 7.084f),
                    PathNode.LineTo(11.516f, 7.084f),
                    PathNode.CurveTo(11.546f, 7.081f, 11.644f, 7.037f, 12.572f, 6.627f),
                    PathNode.CurveTo(13.633f, 6.16f, 14.436f, 5.942f, 15.318f, 6.011f),
                    PathNode.LineTo(15.078f, 5.999f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 1.0f),
                    PathNode.CurveTo(14.552285f, 1.0f, 15.0f, 1.447715f, 15.0f, 2.0f),
                    PathNode.CurveTo(15.0f, 3.656854f, 13.656855f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(11.447715f, 5.0f, 11.0f, 4.552285f, 11.0f, 4.0f),
                    PathNode.CurveTo(11.0f, 2.343146f, 12.343145f, 1.0f, 14.0f, 1.0f),
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
        return _brandApple!!
    }

private var _brandApple: ImageVector? = null
