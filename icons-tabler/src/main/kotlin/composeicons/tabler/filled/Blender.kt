package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Blender: ImageVector
    get() {
        if (_blender != null) return _blender!!
        _blender = tablerFilledIcon(
            name = "Blender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 14c.899 0 1.728 .296 2.396 .797l-.12-.086q.101 .069 .196 .144l-.076-.058q.07 .053 .14 .109l-.064-.05q.072 .055 .14 .115l-.077-.065c.207 .169 .396 .359 .565 .566l-.065-.078q.061 .072 .12 .147l-.055-.07q.057 .071 .111 .144l-.056-.074q.066 .084 .127 .172l-.07-.098q.058 .078 .112 .16l-.042-.062q.054 .078 .104 .157l-.062-.096q.06 .09 .117 .185l-.055-.089 .09 .15-.035-.061c.137 .23 .25 .474 .338 .727l-.055-.15q.039 .1 .073 .201l-.018-.051q.033 .093 .06 .188l-.042-.137q.033 .1 .061 .204l-.019-.067q.027 .091 .05 .184l-.03-.117q.03 .114 .055 .23l-.025-.113q.026 .107 .045 .215l-.02-.101q.021 .1 .037 .201l-.017-.1q.018 .095 .03 .19l-.013-.09c.01 .065 .019 .13 .026 .196l.017 .205L19 18v2c0 1.105-.895 2-2 2h-8C7.895 22 7 21.105 7 20v-2q0-.273 .036-.537l-.013 .105c.007-.065 .016-.13 .026-.194l-.013 .09c.008-.064 .018-.128 .03-.191l-.017 .1q.015-.1 .037-.2l-.02 .1q.02-.108 .046-.215l-.026 .114q.024-.117 .056-.23l-.03 .116c.015-.062 .031-.123 .049-.184l-.02 .067q.03-.104 .062-.204l-.042 .137q.027-.096 .06-.188l-.018 .051c.083-.249 .19-.489 .32-.717l-.064 .117q.048-.09 .1-.178l-.035 .06 .09-.15-.055 .09q.055-.094 .117-.185l-.062 .096q.05-.08 .104-.157l-.042 .061q.054-.08 .113-.16l-.071 .1q.06-.09 .127-.173l-.056 .074q.054-.073 .111-.143l-.055 .069c.162-.207 .343-.398 .542-.57l-.072 .064q.073-.066 .15-.129l-.078 .065c.046-.04 .092-.078 .14-.116l-.062 .051q.068-.056 .139-.11l-.076 .06q.096-.076 .195-.145l-.12 .086q.07-.053 .142-.101l-.022 .015q.072-.05 .145-.096C9.506 14.213 10.246 14 11 14ZM13 17c-.507 0-.934 .38-.993 .883L12 18.01c.001 .529 .413 .966 .941 .997 .528 .031 .989-.355 1.052-.88L14 18c0-.552-.448-1-1-1M14 2c.552-0 .999 .447 1 .999L16.802 3c.593-0 1.156 .263 1.536 .718 .38 .455 .538 1.056 .432 1.64l-1.49 8.191C16.574 13.188 15.793 13 15 13h-4c-.822 0-1.597 .198-2.28 .55L8.256 10.999 6 11C4.895 11 4 10.105 4 9v-4C4 3.895 4.895 3 6 3l5-.001 .007-.116C11.066 2.38 11.493 2 12 2ZM7.165 4.999 6 5v4L7.893 8.999Z"),
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
        return _blender!!
    }

private var _blender: ImageVector? = null
