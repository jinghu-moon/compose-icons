package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSvelte: ImageVector
    get() {
        if (_brandSvelte != null) return _brandSvelte!!
        _brandSvelte = tablerOutlineIcon(
            name = "BrandSvelte",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(10.821f, 10.505f),
                    PathNode.CurveTo(12.681f, 9.355f, 15.233f, 10.015f, 16.395f, 11.857f),
                    PathNode.CurveTo(16.952991f, 12.741519f, 17.133383f, 13.812709f, 16.895863f, 14.831195f),
                    PathNode.CurveTo(16.65834f, 15.849681f, 16.022705f, 16.730566f, 15.131f, 17.277f),
                    PathNode.LineTo(10.078f, 20.403f),
                    PathNode.CurveTo(8.218001f, 21.554f, 5.766f, 20.994f, 4.604f, 19.152f),
                    PathNode.CurveTo(4.04592f, 18.267603f, 3.865373f, 17.196503f, 4.102704f, 16.17803f),
                    PathNode.CurveTo(4.340034f, 15.159556f, 4.975461f, 14.278598f, 5.867f, 13.732f),
                    PathNode.LineTo(6.127f, 13.572f)
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
                    PathNode.MoveTo(8.0f, 17.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(12.178f, 14.496f),
                    PathNode.CurveTo(10.318f, 15.647f, 7.767f, 14.987f, 6.604f, 13.145f),
                    PathNode.CurveTo(6.046008f, 12.260481f, 5.865617f, 11.189291f, 6.103138f, 10.170805f),
                    PathNode.CurveTo(6.340659f, 9.152319f, 6.976295f, 8.271435f, 7.868f, 7.725f),
                    PathNode.LineTo(12.922f, 4.598f),
                    PathNode.CurveTo(14.782f, 3.448f, 17.233f, 4.008f, 18.396f, 5.85f),
                    PathNode.CurveTo(18.953993f, 6.73452f, 19.134384f, 7.80571f, 18.896862f, 8.824195f),
                    PathNode.CurveTo(18.65934f, 9.842681f, 18.023706f, 10.723565f, 17.132f, 11.27f),
                    PathNode.LineTo(16.872f, 11.43f)
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
        return _brandSvelte!!
    }

private var _brandSvelte: ImageVector? = null
