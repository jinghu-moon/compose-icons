package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSamsungpass: ImageVector
    get() {
        if (_brandSamsungpass != null) return _brandSamsungpass!!
        _brandSamsungpass = tablerOutlineIcon(
            name = "BrandSamsungpass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 10.895431f, 4.895431f, 10.0f, 6.0f, 10.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.CurveTo(19.10457f, 10.0f, 20.0f, 10.895431f, 20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.10457f, 19.10457f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.895431f, 21.0f, 4.0f, 20.10457f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 8.138f),
                    PathNode.CurveTo(7.0f, 5.3f, 9.239f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.761f, 3.0f, 17.0f, 5.3f, 17.0f, 8.138f),
                    PathNode.LineTo(17.0f, 10.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.485f, 17.577f),
                    PathNode.CurveTo(10.822f, 17.867f, 11.185f, 18.0f, 12.0f, 18.0f),
                    PathNode.LineTo(12.413f, 18.0f),
                    PathNode.CurveTo(12.736f, 18.0f, 13.046f, 17.867f, 13.275f, 17.632f),
                    PathNode.CurveTo(13.504398f, 17.394218f, 13.632101f, 17.076397f, 13.631f, 16.746f),
                    PathNode.CurveTo(13.631f, 16.414f, 13.503f, 16.096f, 13.275f, 15.86f),
                    PathNode.CurveTo(13.049232f, 15.625843f, 12.738268f, 15.493088f, 12.413f, 15.492f),
                    PathNode.LineTo(11.587f, 15.492f),
                    PathNode.CurveTo(11.262156f, 15.491247f, 10.951495f, 15.358829f, 10.726f, 15.125f),
                    PathNode.CurveTo(10.496601f, 14.887218f, 10.368899f, 14.569398f, 10.37f, 14.239f),
                    PathNode.CurveTo(10.37f, 13.907f, 10.498f, 13.588f, 10.726f, 13.353f),
                    PathNode.CurveTo(10.951326f, 13.118803f, 11.262009f, 12.986014f, 11.587f, 12.985f),
                    PathNode.LineTo(12.0f, 12.985f),
                    PathNode.CurveTo(12.816f, 12.985f, 13.178f, 13.118f, 13.515f, 13.408f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandSamsungpass!!
    }

private var _brandSamsungpass: ImageVector? = null
