package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOnedrive: ImageVector
    get() {
        if (_brandOnedrive != null) return _brandOnedrive!!
        _brandOnedrive = tablerOutlineIcon(
            name = "BrandOnedrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.456f, 10.45f),
                    PathNode.CurveTo(18.029745f, 7.7337f, 15.928411f, 5.586241f, 13.222004f, 5.101117f),
                    PathNode.CurveTo(10.515597f, 4.615994f, 7.799195f, 5.899874f, 6.456f, 8.299f),
                    PathNode.CurveTo(5.172216f, 8.405209f, 3.983204f, 9.017055f, 3.150541f, 9.999935f),
                    PathNode.CurveTo(2.317877f, 10.982816f, 1.90977f, 12.256217f, 2.016f, 13.54f),
                    PathNode.CurveTo(2.120981f, 14.823666f, 2.73162f, 16.013044f, 3.713571f, 16.846466f),
                    PathNode.CurveTo(4.695523f, 17.679886f, 5.968342f, 18.089073f, 7.252f, 17.984f),
                    PathNode.LineTo(18.003f, 17.984f),
                    PathNode.CurveTo(19.001587f, 18.043867f, 19.983042f, 17.704496f, 20.731356f, 17.040579f),
                    PathNode.CurveTo(21.47967f, 16.376661f, 21.933514f, 15.44261f, 21.993f, 14.444f),
                    PathNode.CurveTo(22.118277f, 12.364679f, 20.53431f, 10.577456f, 18.455f, 10.452f),
                    PathNode.LineTo(18.456f, 10.45f)
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
        return _brandOnedrive!!
    }

private var _brandOnedrive: ImageVector? = null
