package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingWindTurbine: ImageVector
    get() {
        if (_buildingWindTurbine != null) return _buildingWindTurbine!!
        _buildingWindTurbine = tablerOutlineIcon(
            name = "BuildingWindTurbine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 11c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 9.895 13.105 9 12 9c-1.105 0-2 .895-2 2")
            addPathData("M10 11v-2.573c0-.18 .013-.358 .04-.536l.716-4.828C10.82 2.466 11.353 2 12 2c.647 0 1.18 .466 1.244 1.063l.716 4.828c.027 .178 .04 .357 .04 .536v2.573")
            addPathData("M13.01 9.28l2.235 1.276c.156 .09 .305 .19 .446 .3l3.836 2.911c.487 .352 .624 1.04 .3 1.596-.325 .556-1 .782-1.548 .541L13.724 14.224c-.168-.065-.33-.142-.486-.231L11.003 12.716")
            addPathData("M13 12.716l-2.236 1.277c-.156 .089-.318 .165-.485 .23L5.724 15.904c-.551 .241-1.223 .015-1.548-.54-.324-.557-.187-1.245 .3-1.597L8.312 10.857c.141-.112 .29-.212 .446-.3L10.993 9.28")
            addPathData("M7 21h10")
            addPathData("M10 21l1-7")
            addPathData("M13 14l1 7")
        }
        return _buildingWindTurbine!!
    }

private var _buildingWindTurbine: ImageVector? = null
