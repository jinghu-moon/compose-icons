package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWechat: ImageVector
    get() {
        if (_brandWechat != null) return _brandWechat!!
        _brandWechat = tablerOutlineIcon(
            name = "BrandWechat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.5f, 10.0f),
                    PathNode.CurveTo(19.538f, 10.0f, 22.0f, 12.015f, 22.0f, 14.5f),
                    PathNode.CurveTo(22.0f, 15.897f, 21.222f, 17.145f, 20.0f, 17.97f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.LineTo(18.036f, 18.822f),
                    PathNode.CurveTo(17.532665f, 18.940868f, 17.01718f, 19.000607f, 16.5f, 19.0f),
                    PathNode.CurveTo(13.462f, 19.0f, 11.0f, 16.985f, 11.0f, 14.5f),
                    PathNode.CurveTo(11.0f, 12.015f, 13.462f, 10.0f, 16.5f, 10.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.197f, 15.698f),
                    PathNode.CurveTo(10.507f, 15.894f, 9.767f, 16.0f, 9.0f, 16.0f),
                    PathNode.CurveTo(8.111395f, 16.001917f, 7.228668f, 15.855923f, 6.388f, 15.568f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 14.199f),
                    PathNode.CurveTo(2.763f, 13.117f, 2.0f, 11.635f, 2.0f, 10.0f),
                    PathNode.CurveTo(2.0f, 6.686f, 5.134f, 4.0f, 9.0f, 4.0f),
                    PathNode.CurveTo(12.782f, 4.0f, 15.863f, 6.57f, 16.0f, 9.785f),
                    PathNode.LineTo(16.0f, 10.018f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(10.01f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 8.0f),
                    PathNode.LineTo(7.01f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 14.0f),
                    PathNode.LineTo(15.01f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 14.0f),
                    PathNode.LineTo(18.01f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandWechat!!
    }

private var _brandWechat: ImageVector? = null
