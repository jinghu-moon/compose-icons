package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FishBone: ImageVector
    get() {
        if (_fishBone != null) return _fishBone!!
        _fishBone = tablerFilledIcon(
            name = "FishBone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.675 6.44l.118 .005c.079 .008 .157 .026 .232 .052l.032 .015 .273 .103c1.936 .771 3.69 2.27 5.253 4.476l.245 .355c.229 .338 .229 .782 0 1.12-1.702 2.519-3.636 4.176-5.792 4.947-.389 .139-.823 .024-1.093-.288C14.911 16.034 14.256 14.564 14.06 13h-2.06v3c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-3h-2v1c0 .552-.448 1-1 1C6.448 15 6 14.552 6 14v-1h-1.166l-.335 .324c-.604 .596-1.188 1.212-1.751 1.846-.367 .413-.999 .451-1.412 .084C.923 14.887 .885 14.255 1.252 13.842q.593-.667 1.214-1.308l.522-.528-.523-.529c-.207-.214-.411-.43-.613-.648l-.6-.661C.885 9.755 .923 9.123 1.336 8.756c.413-.367 1.045-.329 1.412 .084 .662 .746 1.353 1.467 2.069 2.161L6 11v-1C6 9.448 6.448 9 7 9c.552 0 1 .448 1 1v1h2v-3c0-.552 .448-1 1-1 .552 0 1 .448 1 1v3h2.062c.181-1.444 .753-2.811 1.656-3.953l.196-.24 .075-.081 .105-.088 .068-.048 .097-.052 .069-.03 .138-.042 .091-.017q.059-.007 .118-.009M18 10c-.507 0-.934 .38-.993 .883L17 11.01c.001 .529 .413 .966 .941 .997 .528 .031 .989-.355 1.052-.88L19 11c0-.552-.448-1-1-1"),
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
        return _fishBone!!
    }

private var _fishBone: ImageVector? = null
