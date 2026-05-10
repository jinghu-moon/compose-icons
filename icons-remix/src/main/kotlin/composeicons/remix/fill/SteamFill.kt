package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SteamFill: ImageVector
    get() {
        if (_steamFill != null) return _steamFill!!
        _steamFill = remixIcon(
            name = "SteamFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 2C6.754 2 2.449 6.05 2.041 11.198l5.36 2.215c.454-.309 1.002-.492 1.593-.492 .052 0 .104 .003 .157 .005L11.535 9.474v-.049c0-2.079 1.69-3.77 3.77-3.77 2.078 0 3.77 1.692 3.77 3.772 0 2.08-1.692 3.771-3.77 3.771h-.087l-3.397 2.426c0 .043 .003 .088 .003 .132 0 1.563-1.262 2.83-2.825 2.83-1.362 0-2.513-.978-2.776-2.273L2.386 14.725C3.574 18.923 7.428 22 12.005 22c5.523 0 9.999-4.478 9.999-10C22.004 6.477 17.527 2 12.005 2ZM7.079 16.667c.218 .452 .595 .833 1.095 1.042 1.081 .449 2.327-.063 2.777-1.146 .219-.525 .22-1.099 .004-1.624-.216-.525-.625-.934-1.147-1.153-.52-.217-1.075-.207-1.565-.025l1.269 .525c.797 .333 1.174 1.25 .841 2.046-.331 .798-1.247 1.175-2.045 .843L7.079 16.667ZM17.819 9.422c0-1.385-1.128-2.512-2.513-2.512-1.387 0-2.512 1.128-2.512 2.512 0 1.388 1.125 2.513 2.512 2.513 1.386 0 2.513-1.125 2.513-2.513ZM15.312 7.53c1.041 0 1.888 .845 1.888 1.888 0 1.042-.847 1.887-1.888 1.887-1.044 0-1.887-.845-1.887-1.887 0-1.043 .844-1.888 1.887-1.888Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _steamFill!!
    }

private var _steamFill: ImageVector? = null
