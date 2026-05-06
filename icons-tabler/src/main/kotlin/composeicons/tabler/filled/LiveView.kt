package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LiveView: ImageVector
    get() {
        if (_liveView != null) return _liveView!!
        _liveView = tablerFilledIcon(
            name = "LiveView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3c.552 0 1 .448 1 1C9 4.552 8.552 5 8 5h-2C5.448 5 5 5.448 5 6v2C5 8.552 4.552 9 4 9 3.448 9 3 8.552 3 8v-2C3 4.343 4.343 3 6 3Z")
            addPathData("M4 15c.552 0 1 .448 1 1v2c0 .552 .448 1 1 1h2c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2C4.343 21 3 19.657 3 18v-2c0-.552 .448-1 1-1")
            addPathData("M18 3c1.657 0 3 1.343 3 3v2c0 .552-.448 1-1 1C19.448 9 19 8.552 19 8v-2C19 5.448 18.552 5 18 5h-2C15.448 5 15 4.552 15 4c0-.552 .448-1 1-1Z")
            addPathData("M20 15c.552 0 1 .448 1 1v2c0 1.657-1.343 3-3 3h-2c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h2c.552 0 1-.448 1-1v-2c0-.552 .448-1 1-1")
            addPathData("M15.19 7.214c1.851 1.534 2.348 4.167 1.185 6.27l-.056 .09-3.484 4.976c-.023 .036-.049 .07-.077 .103l-.017 .019-.057 .056-.012 .013-.019 .017c-.031 .026-.063 .051-.096 .073l-.053 .03-.038 .024-.011 .005c-.071 .036-.146 .064-.223 .083l-.045 .008-.066 .012c-.08 .01-.162 .01-.242 0l-.061-.011-.05-.01c-.081-.019-.16-.048-.234-.087l-.047-.028-.044-.026-.011-.008-.032-.025-.053-.04-.01-.01-.009-.007-.034-.035-.035-.034-.007-.01-.01-.009-.037-.05-.024-.03-3.5-5-.056-.089C6.461 11.381 6.959 8.747 8.81 7.213c1.851-1.534 4.531-1.534 6.381 .001M12 10c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1")
        }
        return _liveView!!
    }

private var _liveView: ImageVector? = null
