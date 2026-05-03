package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTerraform: ImageVector
    get() {
        if (_brandTerraform != null) return _brandTerraform!!
        _brandTerraform = tablerOutlineIcon(
            name = "BrandTerraform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 15.5f),
                    PathNode.LineTo(3.524f, 9.284f),
                    PathNode.CurveTo(3.200974f, 9.109162f, 2.999797f, 8.771307f, 3.0f, 8.404f),
                    PathNode.LineTo(3.0f, 4.35f),
                    PathNode.CurveTo(3.000084f, 3.866701f, 3.258519f, 3.420315f, 3.677606f, 3.179598f),
                    PathNode.CurveTo(4.096693f, 2.938882f, 4.612489f, 2.94056f, 5.03f, 3.184f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(15.0f, 19.65f),
                    PathNode.CurveTo(14.999916f, 20.133299f, 14.741481f, 20.579685f, 14.322394f, 20.820402f),
                    PathNode.CurveTo(13.903307f, 21.06112f, 13.387511f, 21.05944f, 12.97f, 20.816f),
                    PathNode.LineTo(9.496f, 18.789f),
                    PathNode.CurveTo(9.189072f, 18.609898f, 9.00025f, 18.281363f, 9.0f, 17.926f),
                    PathNode.LineTo(9.0f, 6.0f)
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
                    PathNode.MoveTo(15.0f, 15.5f),
                    PathNode.LineTo(20.504f, 12.29f),
                    PathNode.CurveTo(20.811235f, 12.110718f, 21.000105f, 11.781719f, 21.0f, 11.426f),
                    PathNode.LineTo(21.0f, 7.85f),
                    PathNode.CurveTo(20.999916f, 7.3667f, 20.741482f, 6.920316f, 20.322393f, 6.679599f),
                    PathNode.CurveTo(19.903305f, 6.438882f, 19.38751f, 6.440561f, 18.97f, 6.684f),
                    PathNode.LineTo(15.0f, 9.0f)
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
        return _brandTerraform!!
    }

private var _brandTerraform: ImageVector? = null
