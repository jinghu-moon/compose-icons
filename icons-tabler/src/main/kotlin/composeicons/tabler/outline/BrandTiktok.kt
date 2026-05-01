package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTiktok: ImageVector
    get() {
        if (_brandTiktok != null) return _brandTiktok!!
        _brandTiktok = tablerOutlineIcon(
            name = "BrandTiktok",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 7.917f),
                    PathNode.LineTo(21.0f, 11.951f),
                    PathNode.CurveTo(19.186064f, 11.771042f, 17.456442f, 11.096144f, 16.0f, 10.0f),
                    PathNode.LineTo(16.0f, 14.5f),
                    PathNode.CurveTo(15.999246f, 17.894175f, 13.387074f, 20.716358f, 10.003081f, 20.979057f),
                    PathNode.CurveTo(6.619088f, 21.241756f, 3.602665f, 18.85652f, 3.078097f, 15.503126f),
                    PathNode.CurveTo(2.55353f, 12.149733f, 4.69744f, 8.957272f, 8.0f, 8.174f),
                    PathNode.LineTo(8.0f, 12.5f),
                    PathNode.CurveTo(7.059479f, 13.205391f, 6.737519f, 14.47079f, 7.226546f, 15.539906f),
                    PathNode.CurveTo(7.715572f, 16.609022f, 8.88344f, 17.192957f, 10.032148f, 16.942707f),
                    PathNode.CurveTo(11.180857f, 16.69246f, 12.0f, 15.675652f, 12.0f, 14.5f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(16.083f, 3.0f),
                    PathNode.CurveTo(16.50977f, 5.517773f, 18.482227f, 7.490231f, 21.0f, 7.917f)
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
        return _brandTiktok!!
    }

private var _brandTiktok: ImageVector? = null
