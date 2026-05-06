package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BuildingBroadcastTower: ImageVector
    get() {
        if (_buildingBroadcastTower != null) return _buildingBroadcastTower!!
        _buildingBroadcastTower = tablerFilledIcon(
            name = "BuildingBroadcastTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10c.787-0 1.501 .461 1.825 1.179 .323 .718 .195 1.559-.328 2.148l2.452 7.357c.175 .524-.109 1.09-.633 1.265-.524 .175-1.09-.109-1.265-.633L13.611 20h-3.224l-.438 1.317c-.16 .481-.655 .766-1.152 .663l-.113-.03c-.252-.084-.46-.264-.579-.501-.119-.237-.138-.512-.054-.764l2.452-7.357C10.179 12.962 10 12.489 10 12l.005-.15C10.083 10.806 10.953 10 12 10")
            addPathData("M18.093 4.078c3.593 2.761 4.88 7.593 3.137 11.776-.213 .51-.798 .751-1.308 .538-.51-.213-.751-.798-.538-1.308 1.394-3.346 .364-7.212-2.51-9.421C14 3.455 9.999 3.455 7.125 5.663 4.251 7.872 3.221 11.738 4.615 15.084c.213 .51-.028 1.095-.538 1.308-.51 .213-1.095-.028-1.308-.538C1.026 11.671 2.313 6.839 5.906 4.078 9.499 1.317 14.5 1.317 18.093 4.078")
            addPathData("M15.657 7.243c2.156 1.657 2.928 4.556 1.882 7.066-.213 .51-.798 .751-1.308 .538-.51-.213-.751-.798-.538-1.308 .698-1.673 .183-3.606-1.255-4.711C13.001 7.724 11.001 7.724 9.564 8.828 8.126 9.933 7.611 11.866 8.309 13.539c.213 .51-.028 1.095-.538 1.308-.51 .213-1.095-.028-1.308-.538C5.417 11.799 6.189 8.9 8.345 7.243c2.156-1.657 5.156-1.657 7.312-0")
        }
        return _buildingBroadcastTower!!
    }

private var _buildingBroadcastTower: ImageVector? = null
